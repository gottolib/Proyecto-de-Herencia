import java.util.Scanner;
public class Empleado extends Persona {
protected int sueldo;

public void cargarSueldo()
{
   teclado = new Scanner(System.in); 
	System.out.print("Ingrese sueldo: ");
	sueldo = teclado.nextInt();
	
}
public void imprimirSueldo()
{
	System.out.print("Sueldo: " + sueldo);
}

}
