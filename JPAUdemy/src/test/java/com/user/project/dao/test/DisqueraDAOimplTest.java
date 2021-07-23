package com.user.project.dao.test;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;

import com.user.project.dao.DisqueraDAO;
import com.user.project.dao.impl.DisqueraDAOimpl;
import com.user.project.entity.Disquera;

/**
 * @author chema
 *
 */
public class DisqueraDAOimplTest {
	
	private DisqueraDAO disqueraDAO = new DisqueraDAOimpl();

	/**
	 * Test method for {@link com.user.project.dao.impl.DisqueraDAOimpl#guardar(com.user.project.entity.Disquera)}.
	 */
	@Test
	public void testGuardar() {
		Disquera disquera = new Disquera();
		disquera.setDescripcion("Elektrik");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setFechaModificacion(LocalDateTime.now());
		disquera.setEstatus(true);
		
		this.disqueraDAO.guardar(disquera);
	}

	/**
	 * Test method for {@link com.user.project.dao.impl.DisqueraDAOimpl#actualizar(com.user.project.entity.Disquera)}.
	 */
	@Test
	public void testActualizar() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarById(3);
		
		disqueraConsultada.setDescripcion("Disquera IronMaiden");
		
		this.disqueraDAO.actualizar(disqueraConsultada);
	}

	/**
	 * Test method for {@link com.user.project.dao.impl.DisqueraDAOimpl#eliminar(com.user.project.entity.Disquera)}.
	 */
	@Test
	public void testEliminar() {
		int id = 3;
		
		this.disqueraDAO.eliminar(id);
	}

	/**
	 * Test method for {@link com.user.project.dao.impl.DisqueraDAOimpl#consultar()}.
	 */
	@Test
	public void testConsultar() {
		List<Disquera> disquerasConsultadas = this.disqueraDAO.consultar();
		
		assertTrue(disquerasConsultadas.size() > 0);
		
		disquerasConsultadas.forEach(disquera -> {
			System.out.println("Disquera: "+ disquera.getDescripcion());
		});
	}

	/**
	 * Test method for {@link com.user.project.dao.impl.DisqueraDAOimpl#consultarById()}.
	 */
	@Test
	public void testConsultarById() {
		Disquera disquera = this.disqueraDAO.consultarById(3);
		
		assertNotNull(disquera);
		
		System.out.println("Disquera: "+ disquera.getDescripcion());
	}
	
	@Test
	public void testConsultarByDescripcionJPQL() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarByDescripcionJPQL("Elektrik");
		
		assertNotNull(disqueraConsultada);
		
		System.out.println("Disquera by descripción: "+ disqueraConsultada);
	}
	
	@Test
	public void testConsultarByDescripcionNative() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarByDescripcionNative("Elektrik");
		
		assertNotNull(disqueraConsultada);
		
		System.out.println("Disquera by descripción: "+ disqueraConsultada);
	}
}