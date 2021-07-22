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
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
	}
}