package bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entity.Empleado;
import services.EmpleadoServices;

@ManagedBean
@ViewScoped
public class PrincipalController {
	
	private List<Empleado> empleados;
	private EmpleadoServices empleadoService = new EmpleadoServices();
	
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public EmpleadoServices getEmpleadoService() {
		return empleadoService;
	}

	public void setEmpleadoService(EmpleadoServices empleadoService) {
		this.empleadoService = empleadoService;
	}
}