import java.util.Scanner;

public class AreaPerimeterOfCircle {
    public static void main(String[] args){
        int r;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        double a=3.14*r*r;
        double p=2*3.14*r;
        System.out.println("Area="+a);
        System.out.println("Perimeter= "+p);
        sc.close();
    }
    
}
