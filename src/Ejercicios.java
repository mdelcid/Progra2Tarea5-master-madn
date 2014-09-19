import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

//me base en los ejemplos practicados en clase sobre archivos
public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{//para escribir un archivo
		try
	{
		PrintWriter escritor = new PrintWriter(nombre_archivo);//abrimos el archivo nombrandolo "nombre_archivo"
		escritor.write(contenido);//escribimos en el archivo.. es el contenido del archivo
		escritor.flush();//nos aseguramos que todo lo que escribimos se escriba en el archivo
	}catch(Exception e)//atrapamos cualquier excepcion
	{	
		e.printStackTrace();
	}
		return;
	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{try
	{
		PrintWriter escritor = new PrintWriter(nombre_archivo);//abrimos el archivo nombrandolo "nombre_archivo"
		escritor.write(contenido);//escribimos en el archivo.. es el contenido del archivo
		escritor.flush();//nos aseguramos que todo lo que escribimos se escriba en el archivo
	}catch(Exception e)//atrapamos cualquier excepcion
	{	
		e.printStackTrace();
	}
		return;
	}
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{//para escribir un archivo
		try
	{
		File archivo = new File("nombre_archivo");//iniciamos nuestro archivo "nombre_archivo"
		Scanner s = new Scanner(nombre_archivo);//leemos el archivo "nombre_archivo"
		int integer = 0;//creamos nuestros int
		while(s.hasNext())//para leer todo lo que hay en el archivo(lo lee y avanza)
		System.out.print(integer);//imprimimos lo que hay en el archivo
	}catch (Exception e)//capturamos cualquier excepcion
	{
		e.printStackTrace();
	}
		return -1;
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo)
	{//para leer un archivo
		try
	{
		File archivo = new File("nombre_archivo");//iniciamos nuestro archivo "nombre_archivo"
		Scanner s = new Scanner(nombre_archivo);//leemos el archivo "nombre_archivo"
		String str = "";//creamos nuestro string
		while(s.hasNext())//para leer todo lo que hay en el archivo(lo lee y avanza)
		System.out.print(str);//imprimimos lo que hay en el archivo
	}catch (Exception e)//capturamos cualquier excepcion
	{
		e.printStackTrace();
	}
		return "";
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{//para leer un archivo
		try
	{
		File archivo = new File("nombre_archivo");//iniciamos nuestro archivo "nombre_archivo"
		Scanner s = new Scanner(nombre_archivo);//leemos el archivo "nombre_archivo"
		double firstdouble = 0.0;//creamos nuestro double(es usado para llamar decimales)
		while(s.hasNext())//para leer todo lo que hay en el archivo(lo lee y avanza)
		System.out.print(firstdouble);//imprimimos lo que hay en el archivo
	}catch (Exception e)//capturamos cualquier excepcion
	{
		e.printStackTrace();
	}
		return -1;
	}
	
	//Devuelve si el archivo con nombre nombre_archivo contiene la string buscada
	static boolean existe(String nombre_archivo, String buscada)
	{
		try
	{
		File archivo = new File("nombre_archivo");//iniciamos nuestro archivo "nombre_archivo"
		Scanner s = new Scanner(nombre_archivo);//leemos el archivo "nombre_archivo"
		while(s.hasNext())//para leer todo lo que hay en el archivo(lo lee y avanza)
		System.out.print(s.next());//imprimimos lo que hay en el archivo
	}catch (Exception e)//capturamos cualquier excepcion
	{
		e.printStackTrace();
	}
		return false;
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	static int getNumeroMenor(String nombre_archivo)
	{//para obtener el numero menor
		//basado en el ejemplo en clase que hicimos para encontrar numero mayor
		try
	{
		File archivo = new File("nombre_archivo");//iniciamos nuestro archivo"nombre_archivo"
		Scanner s = new Scanner(nombre_archivo);//leemos el archivo"nombre_archivo"
		int menor = 9999;//creamos int menor
		while(s.hasNext())//para leer todo lo que hay en el archivo(lo lee y avanza)
		{
			int num = s.nextInt();
			if(num<menor)//usamos if para poder obtener el numero menor
				menor = num;
			
		}
		System.out.print("El menor es: "+menor);//imprimimos el numero menor
	}catch (Exception e)//capturamos cualquier excepcion
	{
		e.printStackTrace();
	}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
