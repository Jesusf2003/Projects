/**
 * 
 */
package com.user.project.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.user.project.dao.DisqueraDAO;
import com.user.project.entity.Disquera;

/**
 * @author chema
 * Clase que implementa las transacciones
 * para la tabla Disquera.
 */
public class DisqueraDAOimpl implements DisqueraDAO {
	
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("JPAUdemy");

	@Override
	public void guardar(Disquera disquera) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		try {
			em.persist(disquera);
			et.commit();
		} catch (Exception e) {
			if(et != null) {
				et.rollback();
			}
			System.out.println("Error en: "+ e.getMessage());
		} finally {
			em.close();
		}
	}

	@Override
	public void actualizar(Disquera disquera) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		try {
			em.merge(disquera);
			et.commit();
		} catch (Exception e) {
			if(et != null) {
				et.rollback();
			}
			System.out.println("Error en: "+ e.getMessage());
		} finally {
			em.close();
		}
	}

	@Override
	public void eliminar(int id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		Disquera disqueraConsultada = em.find(Disquera.class, id);
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		try {
			em.remove(disqueraConsultada);
			et.commit();
		} catch (Exception e) {
			if(et != null) {
				et.rollback();
			}
			System.out.println("Error en: "+ e.getMessage());
		} finally {
			em.close();
		}
	}

	@Override
	public List<Disquera> consultar() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		TypedQuery<Disquera> queryDisquera = (TypedQuery<Disquera>) em.createQuery("FROM Disquera ORDER BY DESDIS");
		
		return queryDisquera.getResultList();
	}
	
	@Override
	public Disquera consultarById(int id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		Disquera disqueraConsultado = em.find(Disquera.class, id);
		
		if(disqueraConsultado == null) {
			throw new EntityNotFoundException("La disquera con id "+ id +" no se encontró");
		}
		
		return disqueraConsultado;
	}

}
