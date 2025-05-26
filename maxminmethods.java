import java.util.Scanner;
public class maxminmethods {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       System.out.println("Minimum: "+minimum(a,b,c));
       System.out.println("Maximum: "+maximum(a,b,c));
       sc.close();
    }
    
       static int maximum(int x,int y,int z){
        if(x>y && x>z){
            return x;
        }else if(y>x && y>z){
            return y;
        }else{
            return z;
        }
       }

       static int minimum(int x,int y,int z){
        if(x<y && x<z){
            return x;
        }else if(y<x && y<z){
            return y;
        }else{
            return z;
        }
       }
}
