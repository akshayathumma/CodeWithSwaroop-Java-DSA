import java.util.Scanner;

public class productmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum: "+Product(a,b));
        sc.close();
    }
    static int Product(int a,int b){
        return a*b;
    }
}
