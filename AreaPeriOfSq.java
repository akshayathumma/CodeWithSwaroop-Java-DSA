import java.util.Scanner;
class AreaPeriOfSq {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int a=s*s;
    int p=4*s;
    System.out.println("Perimeter= "+p);
    System.out.println("Area="+a);
    sc.close();
    }
}

