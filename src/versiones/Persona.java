package versiones;

public class Persona {
	
	private String nombre;
	
	private String apellido; 
	
	private int dni;
	
	private int edad;

	public Persona(String nombre, String apellido, int dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad =edad; 
	}
	
	public String getEdad() {
		return edad;
	}
	
	public void setEdad(int Edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
	

}
