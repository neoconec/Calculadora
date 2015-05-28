package examenprogra;
import java.util.Scanner;
public class Calculadora {
    Scanner sc = new Scanner(System.in);
    Operaciones op = new Operaciones();
    double a,b;
    public Calculadora(){
        a=0;
        b=0;
    }
    public Calculadora(double a, double b){
        this.a=a;
        this.b=b;
    }
    
   public void menu(){
       int opcion=0;
      do{
         System.out.println("1) Establecer a y b");
         System.out.println("2) Suma (a+b)");
         System.out.println("3) Resta (a-b)");
         System.out.println("4) Multiplicacion (a*b)");
         System.out.println("5) Division (a/b)");
         System.out.println("6) Potenciacion (a^b)");
         System.out.println("7) Raiz cuadrada (a)");
         System.out.println("8) Salir");
         System.out.println("Respuesta: ");
         opcion = sc.nextInt();
         switch (opcion){
             case 1:
                 a=pedirA(); 
                 b=pedirB();
                 break;
             case 2:
                 System.out.println("La suma es: "+ op.suma(a,b));
                 break;
            case 3:
                System.out.println("La resta es: "+ op.resta(a,b));
                 break;
            case 4:
                System.out.println("La multiplicacion es: "+ op.multiplicacion(a,b));
                 break;    
            case 5:
                System.out.println("La division es: "+ op.division(a,b));
                 break;
            case 6:
                System.out.println("La potenciacion es: "+ op.potenciacion(a,b));
                 break;
            case 7:
                System.out.println("La raiz es: "+ op.raiz(a));
                 break;
            case 8:
                opcion=8;
                 break;    
                 
         }
    
   
     }while(opcion!=8);
   } 
 
    public double pedirA(){
        double a;
        System.out.println("Dame el valor de a; ");
        a = sc.nextDouble();
        return a;
    }
    public double pedirB(){
        System.out.println("Dame el valor de b; ");
        double b = sc.nextDouble();
        return b;
    }
}
