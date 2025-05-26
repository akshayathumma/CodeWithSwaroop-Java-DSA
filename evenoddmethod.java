import java.util.Scanner;
public class evenoddmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        EvenOdd(a);
        sc.close();
    }
    static void EvenOdd(int a){
        if(a%2==0){
            System.out.println(a+" is a Even number");
        }else{
            System.out.println(a+" is a Odd number");
        }
    }
}
