import java.util.Scanner;

public class Numeros{
  public static void main(String[] argv){
    Scanner leer=new Scanner(System.in);
    int inf1;
    int sup1;
    System.out.println("Ingrese el limite inferior: ");
    inf1=leer.nextInt();
    System.out.println("Ingrese el limite superior: ");
    sup1=leer.nextInt();
    for (int i=inf1;i<=sup1;i++){
      if(i%2==0){
        System.out.println(i);
      }
    }
    int a=inf1;
    while(a<=sup1){
      if(a%2==1){
        System.out.println(a);
      }
      a++;
    }
  }
}