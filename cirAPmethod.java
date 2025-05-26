import java.util.Scanner;
public class cirAPmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        Circumference(radius);
        Area(radius);
        sc.close();
    }
    static void Circumference(int r){
        System.out.println("Circumference=2*3.14*radius="+2*3.14*r);
    }
    static void Area(int r){
        System.out.println("Area=3.14*radius*radius="+3.14*r*r);
    }
}
