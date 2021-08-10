package com.project.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.project.entity.Empleado;

/**
 * @author chema
 * Método que permite consultar la lista
 * de empleados.
 */
public class EmpleadoService {
	
	/**
	 * @author chema
	 * Método que permite consultar un empleado por su ID.
	 * @param numerpEmpleado {@link String} numero del empleado.
	 * @return {@link Empleado} empleado consultado.
	 */
	public Empleado consultarEmpleadoPorNumeroEmpleado(String numeroEmpleado) {
		List<Empleado> empleadosConsultados = this.consultarEmpleados();
		
		for (Empleado empleadosConsultado : empleadosConsultados) {
			if (empleadosConsultado.getNumeroEmpleado().equals(numeroEmpleado)) {
				return empleadosConsultado;
			}
		}
		
		return null;
	}
	
	/**
	 * @author chema
	 * Método que simula la consulta de un empleado.
	 * @return {@link Empleado} empleado consultado.
	 */
	public Empleado consultarEmpleado() {
		Empleado empleado = new Empleado();
		
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Diego");
		empleado.setPrimerApellido("Paniagua");
		empleado.setSegundoApellido("López");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(31);
		
		return empleado;
	}
	
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new ArrayList<>();
		
		Empleado empleado = new Empleado();
		
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Diego");
		empleado.setPrimerApellido("Paniagua");
		empleado.setSegundoApellido("López");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(31);
		
		Empleado empleadoNuevo = new Empleado();
		
		empleadoNuevo.setNumeroEmpleado("453265");
		empleadoNuevo.setNombre("Erick");
		empleadoNuevo.setPrimerApellido("Guerrero");
		empleado.setSegundoApellido("Gómez");
		empleadoNuevo.setFechaCreacion(LocalDateTime.now());
		empleadoNuevo.setEdad(31);
		
		empleados.add(empleado);
		empleados.add(empleadoNuevo);
		
		return empleados;
	}
}