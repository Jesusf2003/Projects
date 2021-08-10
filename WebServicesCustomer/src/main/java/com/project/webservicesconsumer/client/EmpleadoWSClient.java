/**
 * 
 */
package com.project.webservicesconsumer.client;

import java.time.LocalDateTime;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//import org.glassfish.jersey.client.ClientConfig;
//import org.glassfish.jersey.logging.LoggingFeature;

import com.project.webservicesconsumer.dto.EmpleadoDTO;

/**
 * @author chema
 * Clase cliente que permite consumir el webservice de Empleados.
 */
public class EmpleadoWSClient {
	/**
	 * 
	 * @param args
	 */
	public static void main(String []args) {
		//:: GET ::
//		Client client = ClientBuilder.newClient();
//		WebTarget webTarget = client.target("http://localhost:8080/WebServices/project/empleadosWS").path("consultarEmpleadoPorNumeroEmpleado");
//		
//		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
//		Response response = invocationBuilder.get();
//		
//		if (response.getStatus() == 204) {
//			System.out.println("No se encontró el empleado con el número de empleado.");
//		}
//		
//		if (response.getStatus() == 200) {
//			EmpleadoDTO empleadoDTO = response.readEntity(EmpleadoDTO.class);
//			
//			System.out.println("Nombre empleado: "+ empleadoDTO.getNombre());
//			System.out.println("Fecha de Creación: "+ empleadoDTO.getFechaCreacion());
//		}
		
		//:: POST ::
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/WebServices/project/empleadosWS").path("consultarEmpleadoPorNumeroEmpleado");
		
		EmpleadoDTO emp = new EmpleadoDTO();
		emp.setNumeroEmpleado("123456");
		emp.setNombre("Luis Jesus");
		emp.setPrimerApellido("López");
		emp.setSegundoApellido("Romero");
		emp.setEdad(50);
		emp.setFechaCreacion(LocalDateTime.now());
		
		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.post(Entity.entity(emp, MediaType.APPLICATION_JSON));
		
		if (response.getStatus() == 400) {
			String error = response.readEntity(String.class);
			System.out.println(error);
		}
		
		if (response.getStatus() == 200) {
			EmpleadoDTO empleadoDTO = response.readEntity(EmpleadoDTO.class);
			
			System.out.println(empleadoDTO.getNombre());
			System.out.println(empleadoDTO.getFechaCreacion());
		}
	}
}