
//Implementar las funciones
//Sugerencia: pueden usar la funcion main para probar sus funciones pero no es necesario
//Recuerden que pueden:
//"devolver" valores con el "return"
//"Imprimir" valores con el "System.out.print"
//"Pedir" valores con el "Scanner"

public class Ejercicios
{
	//devuelve x multiplicado por 2 (1pt)
	static int multiplicarPorDos(int x)
	{
		int resultado= x*2;
		return resultado;
	}
	
	//devuelve el numero mayor entre a, b, c y d (2pts)
	static int getMayor(int a, int b, int c, int d)
	{
		if (a>b)
		{
			return a;
		}else if (b>a)
		{
		
		return b;
		}
		if (a>c)
		{
			return a;
		}else if (c>a)
		{
		
		return c;
		}
		if (a>d)
		{
			return a;
		}else if (d>a)
		{
		
		return d;
		}
		return a;
	}
	
	//Pide 2 nombres de personas.
	//Si los nombres son iguales imprime "Tocayos" de lo contrario imprime "No son tocayos". (2pts)
	void sonTocayos()
	{
		
	}
	
	//Imprime 100 numeros que sean multiplos de 5(3pts)
	void imprimirMultiplosDe5()
	{
		int resto;
		int numero1 = 10;
		int numero2 = 5;

		resto = numero1%numero2;

		if (resto==0)
		  System.out.println(numero1 + " es múltiplo de " + numero2);
		else
		  System.out.println(numero1 + " NO es múltiplo de " + numero2);
	}
	
	//Devuelve true si edad es menor o igual a 25 y promedio mayor o igual a 85 (3pts)
	boolean aplicaBeca(int edad, int promedio)
	{if ((edad<=25)&& (promedio>=85))
	{
		return true;
		
	}

		return false;
	
	
	}


	
	//Pide 4 numeros, si todos son pares devuelve true, de lo contrario devuelve false (4puntos)
	boolean sonPares(int x, int y, int z,int u)
	{
		if((x % 2 ==0)&&( y % 2 == 0)&& (z % 2 == 0)&& (u % 2 == 0) )
	{
		return true;
	}
		return false;
	}
	
	//Pueden probar sus funciones en el main pero no es necesario ni será evaluado
	public static void main(String args[])
	{
		
	}
}
