import java.util.Scanner;

public class Actividad3{

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Indique que valores quieres que se usen para realizar la siguiente"
        + "operación, siendo la letra S para la suma, R para la"
        + "resta, P para el producto y D para la división. ");
    
    char operacion = sc.next().charAt(0);
    double valor1;
    double valor2; 
    switch (operacion) {
      case 'S':
        System.out.println("Indique el primer valor");
        valor1 = Double.parseDouble(sc.next());
        
        System.out.println("Indique el primer valor");
        valor2 = Double.parseDouble(sc.next());
        
        double suma = valor1 + valor2;
        System.out.println("El resultado es " + suma);
      break;
      case 'R':
        System.out.println("Indique el primer valor");
        valor1 = Double.parseDouble(sc.next());
      
        System.out.println("Indique el primer valor");
        valor2 = Double.parseDouble(sc.next());
        
        double resta = valor1 - valor2;
        System.out.println("El resultado es " + resta);
      break;
      case 'P':
        System.out.println("Indique el primer valor");
        valor1 = Double.parseDouble(sc.next());
      
        System.out.println("Indique el primer valor");
        valor2 = Double.parseDouble(sc.next());
      
        double producto = valor1 * valor2;
        System.out.println("El resultado es " + producto);
      break;
      case 'D':
      System.out.println("Indique el primer valor");
      valor1 = Double.parseDouble(sc.next());
      
      System.out.println("Indique el primer valor");
      valor2 = Double.parseDouble(sc.next());
      
      double division = valor1 / valor2;
      System.out.println("El resultado es " + division);
      break;
      }
    sc.close();
    
  }
}

