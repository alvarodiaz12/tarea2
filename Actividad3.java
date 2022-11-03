import java.util.Scanner;

public class Actividad3{

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Dime el valor de valor1:");
    int valor1 = Integer.parseInt(sc.next());
    
    System.out.println("Dime el valor de valor2:");
    int valor2 = Integer.parseInt(sc.next());
    
    int suma = valor1 + valor2;
    
    System.out.println("La suma de " + valor1 + " y " + valor2 + " es " + suma);

     if ( numero % 2 == 0 )
        {
            System.out.printf( "ES PAR" );
        }
        else
        {
            System.out.printf( "ES IMPAR" );
        }
    
    sc.close();
    
  }
}

