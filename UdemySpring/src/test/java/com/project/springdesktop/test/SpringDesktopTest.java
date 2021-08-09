package com.project.springdesktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.dao.DisqueraDAO;
import com.project.dao.impl.DisqueraDAOImpl;

/**
 * @author chema
 * Clase de prueba unitaria que permite
 * realizar pruebas con el framework Spring.
 **/
class SpringDesktopTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		
		DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);
		
		DisqueraDAO disqueraDAONuevo = (DisqueraDAO) context.getBean("disqueraDAO");
		
		DisqueraDAO disqueraDAOinSpring = new DisqueraDAOImpl();
		DisqueraDAO disqueraDAOinSpringNuevo = new DisqueraDAOImpl();
		
		System.out.println("Contexto cargado exitósamente...");
		System.out.println(disqueraDAO);
		System.out.println(disqueraDAONuevo);
		
		System.out.println(disqueraDAOinSpring);
		System.out.println(disqueraDAOinSpringNuevo);
		
		// :: Properties ::
		Properties properties = (Properties) context.getBean("properties");
		
		System.out.println(properties.get("spring-username"));
	}
}