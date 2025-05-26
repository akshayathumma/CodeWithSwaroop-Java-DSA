import java.util.Scanner;
public class primenobtw2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        primenos(a,b);
        sc.close();
    }
    static boolean isPrime(int a){
        int count=0;
        if(a>1){
            for(int i=1;i<=a;i++){
                if(a%i==0){
                    count++;
                }
            }
            if(count==2){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    static void primenos(int x,int y){
        for(int i=x;i<=y;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
}
