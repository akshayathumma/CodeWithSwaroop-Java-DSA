import java.util.Scanner;

public class VolPyramid {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int BA=sc.nextInt();
    int hgt=sc.nextInt();
    System.out.println("Base Area= "+BA);
    System.out.println("Height= "+hgt);
    double vol=0.33*BA*hgt;
    System.out.println("Volume= "+vol);
    sc.close();
   }
}
