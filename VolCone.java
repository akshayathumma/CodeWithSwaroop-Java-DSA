import java.util.Scanner;
public class VolCone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rad=sc.nextInt();
        int hgt=sc.nextInt();
        System.out.println("Radius= "+rad);
        System.out.println("Height= "+hgt);
        double vol=0.33*3.14*rad*rad*hgt;//1/3=0.33
        System.out.println("Volume= "+vol);
        sc.close();
    }
}
