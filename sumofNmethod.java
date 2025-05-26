import java.util.Scanner;
public class sumofNmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Sum(n);
        sc.close();
    }
    static void Sum(int x){
        int sum=0;
        for(int i=1;i<=x;i++){
            sum=sum+i;
        }
        System.out.println("Sum of "+x+" natural numbers: "+sum);
    }
}
