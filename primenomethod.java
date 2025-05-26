import java.util.Scanner;
public class primenomethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isPrime(n);
        sc.close();
    }
    static void isPrime(int a){
        int count=0;
        if(a>1){
            for(int i=1;i<=a;i++){
                if(a%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(a+" is a prime number.");
            }else{
                System.out.println(a+" is not a prime number.");
            }
        }else{
            System.out.println(a+" is not a prime number.");
        }
    }
}
