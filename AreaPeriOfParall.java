import java.util.Scanner;
class AreaPeriOfParall{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int h=sc.nextInt();
    System.out.println("b= "+b);
    System.out.println("h= "+h);
    int a=b*h;
    int p=2*(a+b);
    System.out.println("Perimeter= "+p);
    System.out.println("Area= b*h = "+a);
    sc.close();
    }
}
