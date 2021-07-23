/**
 * 
 */
package com.user.project.dao;

import java.util.List;

import com.user.project.entity.SubGenero;

/**
 * @author chema
 * Interface DAO que realiza el CRUD
 * con JPA para la tabla de subgénero
 */
public interface SubGeneroDAO {
	/**
	 * Método que permite guardar un subgénero.
	 * @param subGenero {@link SubGenero} objeto a guardar
	 */
	void guardar(SubGenero subGenero);
	/**
	 * Método que permite actualizar un subgénero.
	 * @param subGenero {@link SubGenero} objeto a actualizar
	 */
	void actualizar(SubGenero subGenero);
	/**
	 * Método que permite eliminar un subgénero por su identificador.
	 * @param id {@link int} identificador del subgénero eliminar
	 */
	void eliminar(int id);
	/**
	 * Método que permite consultar la lista de subgéneros.
	 * @return {@link list} lista de subgéneros consultados.
	 */
	List<SubGenero> consultar();
	/**
	 * Método que permite consultar un SubGénero a partir de su
	 * identificador
	 * @param id {@link} identificador del subgénero a consultar
	 * @return {@link SubGenero} un objeto subgénero consultado.
	 */
	SubGenero consultarById(int id);
}