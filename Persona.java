import java.util.Scanner;
public class Persona {
protected Scanner teclado;
protected String nombre;
protected int edad;
public void cargar()
{
	teclado = new Scanner (System.in);
	System.out.print("Ingrese nombre: ");
	nombre = teclado.next();
	System.out.print("Ingrese edad: ");
	edad = teclado.nextInt();
}
public void imprimir()
{
	System.out.println("Nombre: " + nombre);
	System.out.println("Edad: " + edad);
}
}
