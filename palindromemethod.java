import java.util.Scanner;
public class palindromemethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isPalindrome(n);
        sc.close();
    }
    static void isPalindrome(int x){
        int num=x;
        int sum=0;
        int lastdigit;
        while(x>0){
            lastdigit=x%10;
            sum=sum*10+lastdigit;
            x=x/10;
        }
        if(sum==num){
            System.out.println(num+" is a palindrome.");
        }else{
            System.out.println(num+" is not a palindrome.");
        }
    }
}
