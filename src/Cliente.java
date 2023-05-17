
public class Cliente {
	
	//ATRIBUTOS CLIENTE//
	String Nombre; 
	String Telefono; 
	String Direccion; 
	String Fecha;
	
	
	public Cliente(String nombre, String telefono, String direccion, String fecha) {
		super();
		Nombre = nombre;
		Telefono = telefono;
		Direccion = direccion;
		Fecha = fecha;
		
	} 

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	
}//FIN//
