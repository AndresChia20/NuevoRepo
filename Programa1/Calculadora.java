import java.util.Scanner;

public class Calculadora{
  public static void main(String[] argv){
    Scanner leer=new Scanner(System.in);
    int num1;
    int num2;
    System.out.println("Escriba la operacion: ");
    char operador= leer.next().charAt(0);
    switch (operador){
      case '+':
        System.out.println("Ingrese un numero: ");
        num1=leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2=leer.nextInt();
        System.out.println("El resultado fue: " + (num1+num2));
      break; case '-':
        System.out.println("Ingrese un numero: ");
        num1=leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2=leer.nextInt();
        System.out.println("El resultado fue: " + (num1-num2));
      break; case '*':
        System.out.println("Ingrese un numero: ");
        num1=leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2=leer.nextInt();
        System.out.println("El resultado fue: " + (num1*num2));
      break; case '/':
        System.out.println("Ingrese un numero: ");
        num1=leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2=leer.nextInt();
        System.out.println("El resultado fue: " + (num1/num2));
      break;
    }
  }
}