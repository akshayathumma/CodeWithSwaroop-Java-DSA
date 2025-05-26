import java.util.Scanner;
public class AreaIsoceles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        double area=(b/4)*Math.sqrt((4*a*a)-b*b);
        System.out.println("Area of isoceles triangle=(b/4)*sqrt((4*a*a)-b*b)= "+area);
        sc.close();
    }
}
