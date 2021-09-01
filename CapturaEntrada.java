import java.util.*;
// Clase Captura Entrada:
// Creacion de metodos para pedir en consola los datos que se pida int, String, Double, float

public class CapturaEntrada{
    /*
	En cada metodo de esta clase son Static ya que no requieren de un objeto para poder ser invocados
	Para esta clase sse requiere de una clase Scaner de java.util*


	En cada metodo tiene un parametro que recibe un mensaje de tipo String para indicar al usuario
	que tipo de dato debe ingresar y no genere un error de ejecucion y regresa el valor 
	que el usuario introduce en consola 

	Este valor que regresa es devuelto al contructor del objeto de tipo Alumno
	*/

    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextInt());
    }

    public static float capturarFlotante(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextFloat());
    }

    public static double capturarDoble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextDouble());
    }

    public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }


}