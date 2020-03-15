package com.islasfilipinas;

public class Alumno {

	private String nombre;
	private String apellido;
	private int edad;
	private String telefono;
	private String email;
	private String numExpediente;
	private String dni;
	private String fechaNacimiento;
	private int nota;

//Primer constructor por defecto;
	public Alumno() {

	}

//Segundo constructor con solo 3 atributos
	public Alumno(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

//Tercer constructor con todos sus atributos	
	public Alumno(String nombre, String apellido, int edad, String telefono, String email, String numExpediente,
			String dni, String fechaNacimiento, int nota) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
		this.numExpediente = numExpediente;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.nota = nota;
	}

// CREAMOS LOS SET Y GETTER DE TODOS LOS ATRIBUTOS

	// NOMBRE

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// APELLIDO

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	// EDAD

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// TELEFONO

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	// EMAIL

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	// NUMEXPEDIENTE

	public String getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(String numExpediente) {
		this.numExpediente = numExpediente;
	}
	// DNI

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	// FECHANACIMIENTO

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	// NOTA

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	@Override //SobreEscribiendo el metodo de toString.
	
	public String toString() {

		String mensaje = "La informacion del primer alumno es:  " + getNombre() + ", " + getApellido() + ", " + getEdad() + ", "
				+ getTelefono() + ", " + getEmail() + ", " + getNumExpediente() + ", " + getFechaNacimiento() + ", " + getNota();
		return mensaje;
	}

	//COMPARA SOBRE LOS ATRIBUTOS
	public boolean equals(Object otraPersona) {
		Alumno otra = (Alumno) otraPersona;
		boolean iguales;
		if (this.nombre.equals(otra.nombre) && this.apellido.equals(otra.apellido)
				&& this.telefono.equals(otra.telefono) && this.email.equals(otra.email)
				&& this.numExpediente.equals(otra.numExpediente) && this.fechaNacimiento.equals(otra.fechaNacimiento)
				&& this.nota == otra.nota && this.edad == otra.edad) {
			iguales = true;

		} else {
			iguales = false;
		}
		return iguales;

	}

}
