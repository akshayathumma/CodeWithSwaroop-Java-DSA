import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        int b,h;
        Scanner sc=new Scanner(System.in);
        b=sc.nextInt();
        h=sc.nextInt();
        double a=0.5*b*h;
        System.out.println("Area of triangle=1/2*b*h= "+a);
        sc.close();
    }
    
}
