class ReverseANum {
    public static void main(String[] args) {
        int num=7654;
        int sum=0;
        int LastDigit;
        while(num>0){
            LastDigit=num%10;
            sum=sum*10+LastDigit;
            num=num/10;
        }
        System.out.println("ReversedNum: "+sum);
    }
}
