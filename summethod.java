import java.util.Scanner;
public class summethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum: "+Sum(a,b));
        sc.close();
    }
    static int Sum(int a,int b){
        return a+b;
    }
}
