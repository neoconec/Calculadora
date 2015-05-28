package examenprogra;
public class Operaciones{
    
    public double suma(double a, double b){
        return a+b;
    }
    public double resta(double a, double b){
        return a-b;
    }
    public double multiplicacion(double a, double b){
        return a*b;
    }
    public double division(double a, double b){
        return a/b;
    }
    public double potenciacion(double a, double b){
        double i,aux=a;
        for(i=1;i<b;i++)
            a=aux*a;
        return a;
    }
    public double raiz(double a){
        double x1,x;
        x1=a/2;
        do{
            x=x1;
            x1=(x+(a/x))/2;
            //a=1/a*a-1/a;
        }while(x-x1>0.0001);
        return x1;
    }
    
}
