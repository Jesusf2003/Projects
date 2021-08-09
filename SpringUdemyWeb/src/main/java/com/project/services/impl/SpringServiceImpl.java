/**
 * 
 */
package com.project.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.EmpleadoDAO;
import com.project.services.SpringService;

/**
 * @author chema
 * 
 */
@Service
public class SpringServiceImpl implements SpringService {
	
	@Autowired
	private EmpleadoDAO empleadoDAOImpl;

	@Override
	public String mostrarNombreEmpresa() {
		return "Anotaciones con Spring y JSF";
	}

	@Override
	public String mostrarNombreEmpleado() {
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}
}