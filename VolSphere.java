import java.util.Scanner;
public class VolSphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rad=sc.nextInt();
        System.out.println("Radius= "+rad);
        double vol=1.33*3.14*rad*rad*rad;// 4/3=1.33
        System.out.println("Volume= "+vol);
        sc.close();
    }
}
