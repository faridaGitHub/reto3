package modelo;

public class Cliente {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private String sexo;
	private String contrase�a;
	private String fechaNaci;
	
	public Cliente() {
		super();
	}

	public Cliente(String dni, String nombre, String apellidos, String sexo, String contrase�a,String fechaNacimi) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.contrase�a = contrase�a;
		this.fechaNaci=fechaNacimi;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni=dni ;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String getFechaNaci() {
		return fechaNaci;
	}

	public String setFechaNaci(String fechaNaci) {
		return this.fechaNaci = fechaNaci;
	}



}