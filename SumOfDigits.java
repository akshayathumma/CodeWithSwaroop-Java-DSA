public class SumOfDigits {
    public static void main(String[] args) {
        int num=890;
        int sum=0;
        int LastDigit;
        while(num>0){
            LastDigit=num%10;
            sum+=LastDigit;
            num=num/10;
        }
        System.out.println(sum);
    }
}
