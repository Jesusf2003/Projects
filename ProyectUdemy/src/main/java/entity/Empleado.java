package entity;

public class Empleado {
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String puesto;
	private boolean status;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPrimerApellido() {
		return primerApellido;
	}
	
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	
	public String getSegundoApellido() {
		return segundoApellido;
	}
	
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	
	public String getPuesto() {
		return puesto;
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}