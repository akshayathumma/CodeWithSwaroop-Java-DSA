import java.util.Scanner;
class Product {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a*b;
        System.out.println("Sum="+c);
        sc.close();
    }
    
}
