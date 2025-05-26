import java.util.Scanner;

class AreaPeriOfEquilTria {
     public static void main(String[] args){
        int s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();
        double a=(Math.sqrt(3)/2)*s*s;
        int p=3*s;
        System.out.println("Perimeter= "+p);
        System.out.println("Area of Equilateral triangle= "+a);
        sc.close();
    }
}
