import java.util.Scanner;
class AreaPeriOfRect {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int w=sc.nextInt();
    int l=sc.nextInt();
    System.out.println("l= "+l);
    System.out.println("w= "+w);
    int a=l*w;
    int p=2*(l+w);
    System.out.println("Perimeter= "+p);
    System.out.println("Area of rectangle = l*w = "+a);
    sc.close();
    }
}
