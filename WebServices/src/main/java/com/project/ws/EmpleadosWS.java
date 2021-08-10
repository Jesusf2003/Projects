/**
 * 
 */
package com.project.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.project.entity.Empleado;
import com.project.service.EmpleadoService;

/**
 * @author chema
 * WebService generado con Jersey.
 */
@Path("empleadosWS")
public class EmpleadosWS {
	
	private EmpleadoService empleadoservice = new EmpleadoService();
	
	@GET
	@Path("test")
	public String test() {
		return "Probando webservice con Jersey";
	}
	
	@GET
	@Path("consultarEmpleado")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Empleado consultarEmpleado(){
		return this.empleadoservice.consultarEmpleado();
	}
	
	@GET
	@Path("consultarEmpleados")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Empleado> consultarEmpleados(){
		return this.empleadoservice.consultarEmpleados();
	}
	
	@POST
	@Path("consultarEmpleadoPorNumeroEmpleado/{numEmp}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response consultarEmpleadoPorNumeroEmpleado(@PathParam("numEmp") String numeroEmpleado) {
		
		Empleado empleadoConsultado = this.empleadoservice.consultarEmpleadoPorNumeroEmpleado(numeroEmpleado);
		
		if (empleadoConsultado == null) {
			return Response.noContent().build();
		}
		
		GenericEntity<Empleado> empleadoGeneric = new GenericEntity<Empleado>(empleadoConsultado, Empleado.class);
		
		return Response.ok(empleadoGeneric).build();
	}
	
	@POST
	@Path("consultarEmpleadoPorNumeroEmpleado/{numEmp}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response guardarEmpleado(Empleado empleado) {
		if (empleado == null) {
			return Response.status(400).entity("No se ingresó información del empleado, favor de capturar sus datos.").build();
		}
		
		if (empleado.getNombre() == null || empleado.getNombre().isEmpty()) {
			return Response.status(400).entity("El nombre es requerido.").build();
		}
		
		GenericEntity<Empleado> empleadoGeneric = new GenericEntity<Empleado>(empleado, Empleado.class);
		
		return Response.ok(empleadoGeneric).build();
	}
}