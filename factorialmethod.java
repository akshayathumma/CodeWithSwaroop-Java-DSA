import java.util.Scanner;
public class factorialmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Factorial(n);
        sc.close();
    }
    static void Factorial(int a){
        int factorial=1;
        for(int i=1;i<=a;i++){
            factorial*=i;
        }
        System.out.println("Factorial of "+a+"="+factorial);
    }
}
