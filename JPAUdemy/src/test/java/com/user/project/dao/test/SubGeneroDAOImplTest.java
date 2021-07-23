/**
 * 
 */
package com.user.project.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.user.project.dao.SubGeneroDAO;
import com.user.project.dao.impl.SubGeneroDAOImpl;
import com.user.project.entity.SubGenero;
import com.user.project.entity.Genero;

/**
 * @author chema
 * Clase TEST para comprobar el funcionamiento de los métodos
 * del CRUD de subgénero.
 */
class SubGeneroDAOImplTest {
	
	private SubGeneroDAO subGeneroDAO = new SubGeneroDAOImpl();
	
	/**
	 * Test method for {@link com.user.project.dao.impl.SubGeneroDAOImpl#guardar(com.user.project.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		SubGenero subGenero = new SubGenero();
		
		subGenero.setDescripcion("Hard Core");
		subGenero.setFechaCreacion(LocalDateTime.now());
		subGenero.setFechaModificacion(LocalDateTime.now());
		subGenero.setEstatus(true);
		
		Genero genero = new Genero();
		
		genero.setDescripcion("Metal");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setFechaModificacion(LocalDateTime.now());
		genero.setEstatus(true);
		
		subGenero.setGenero(genero);
		
		this.subGeneroDAO.guardar(subGenero);
	}

	/**
	 * Test method for {@link com.user.project.dao.impl.SubGeneroDAOImpl#actualizar(com.user.project.entity.SubGenero)}.
	 */
	@Test
	void testActualizar() {
		SubGenero subGeneroConsultado = this.subGeneroDAO.consultarById(1);
		
		subGeneroConsultado.setDescripcion("Trash Metal");
		subGeneroConsultado.getGenero().setDescripcion("Metal Trash");
		
		this.subGeneroDAO.actualizar(subGeneroConsultado);
	}

	/**
	 * Test method for {@link com.user.project.dao.impl.SubGeneroDAOImpl#eliminar(int)}.
	 */
	@Test
	void testEliminar() {
		this.subGeneroDAO.eliminar(1);
	}

	/**
	 * Test method for {@link com.user.project.dao.impl.SubGeneroDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<SubGenero> subGenerosConsultados = this.subGeneroDAO.consultar();
		
		assertTrue(subGenerosConsultados.size() > 0);
		
		for (SubGenero subGenero : subGenerosConsultados) {
			System.out.println("Subgenero: " + subGenero.getDescripcion());
			System.out.println("Genero: " + subGenero.getGenero().getDescripcion());
		}
	}

	/**
	 * Test method for {@link com.user.project.dao.impl.SubGeneroDAOImpl#consultarById(int)}.
	 */
	@Test
	void testConsultarById() {
	}
}