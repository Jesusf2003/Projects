package services;

import java.util.ArrayList;
import java.util.List;

import entity.Empleado;

public class EmpleadoServices {
	
	public List<Empleado> consultarEmpleados() {
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoDeloite = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("López");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setStatus(true);
		
		empleadoMicrosoft.setNombre("Luis Jesús");
		empleadoMicrosoft.setPrimerApellido("López");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setStatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("López");
		empleadoApple.setSegundoApellido("Romero");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setStatus(true);
		
		//:::::::::::::::::::::::::::::::::::::::::::::::::
		
		empleadoNetflix.setNombre("Christian");
		empleadoNetflix.setPrimerApellido("Paniagua");
		empleadoNetflix.setSegundoApellido("López");
		empleadoNetflix.setPuesto("Senior Developer Java");
		empleadoNetflix.setStatus(true);
		
		empleadoAmazon.setNombre("Luisa");
		empleadoAmazon.setPrimerApellido("López");
		empleadoAmazon.setSegundoApellido("Romero");
		empleadoAmazon.setPuesto("CEO");
		empleadoAmazon.setStatus(true);
		
		empleadoHP.setNombre("Lupe");
		empleadoHP.setPrimerApellido("López");
		empleadoHP.setSegundoApellido("Romero");
		empleadoHP.setPuesto("Architect");
		empleadoHP.setStatus(true);
		
		empleadoOracle.setNombre("Carlos");
		empleadoOracle.setPrimerApellido("Paniagua");
		empleadoOracle.setSegundoApellido("López");
		empleadoOracle.setPuesto("Senior Developer Java");
		empleadoOracle.setStatus(true);
		
		empleadoDeloite.setNombre("Adrián");
		empleadoDeloite.setPrimerApellido("López");
		empleadoDeloite.setSegundoApellido("Romero");
		empleadoDeloite.setPuesto("CEO");
		empleadoDeloite.setStatus(true);
		
		empleadoDisney.setNombre("César");
		empleadoDisney.setPrimerApellido("López");
		empleadoDisney.setSegundoApellido("Romero");
		empleadoDisney.setPuesto("Architect");
		empleadoDisney.setStatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);
		empleados.add(empleadoOracle);
		empleados.add(empleadoDeloite);
		empleados.add(empleadoDisney);
		
		return empleados;
	}
}