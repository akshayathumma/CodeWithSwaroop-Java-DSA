import java.util.Scanner;
public class Cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int tsa=6*a*a;
        System.out.println("Total Surface Area of Cube= "+tsa);
        sc.close();
    }
}
