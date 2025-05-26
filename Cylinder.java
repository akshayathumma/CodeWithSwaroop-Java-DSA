import java.util.Scanner;
class Cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rad=sc.nextInt();
        int hgt=sc.nextInt();
        System.out.println("Radius= "+rad);
        System.out.println("Height= "+hgt);
        double vol=3.14*rad*rad*hgt;
        System.out.println("Volume= "+vol);
        double csa=2*3.14*rad*hgt;
        System.out.println("Curved Surface Area= "+csa);
        sc.close();
    }
}
