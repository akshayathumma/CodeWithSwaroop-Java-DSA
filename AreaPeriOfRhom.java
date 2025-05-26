import java.util.Scanner;

public class AreaPeriOfRhom {
    public static void main(String[] args){
        int d1,d2;
        Scanner sc=new Scanner(System.in);
        d1=sc.nextInt();//diagonal
        d2=sc.nextInt();//diagonal
        double a=0.5*d1*d2;
        int s=sc.nextInt();//side
        int p=4*s;
        System.out.println("Perimeter= "+p);
        System.out.println("Area of Rhombus=1/2*d1*d2= "+a);
        sc.close();
    }
    
}
