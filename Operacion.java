
public class Operacion {
	public static void main (String []ar)
	{
		Persona persona1 = new Persona();
		persona1.cargar();
		persona1.imprimir();
		Empleado empleado1 = new Empleado();
		empleado1.cargarSueldo();
		empleado1.imprimirSueldo();
	}
	
}
