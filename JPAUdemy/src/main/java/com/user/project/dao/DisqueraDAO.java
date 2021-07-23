/**
 * 
 */
package com.user.project.dao;

import java.util.List;

import com.user.project.entity.Disquera;

/**
 * @author chema
 * Interface que genera el DAO para las
 * transacciones del CRUD a la tabla de
 * disquera.
 */
public interface DisqueraDAO {
	
	void guardar(Disquera disquera);
	
	void actualizar(Disquera disquera);
	
	void eliminar(int id);
	
	List<Disquera> consultar();

	Disquera consultarById(int id);
}