import java.util.Scanner;
class Average {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=3;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        int avg=sum/n;
        System.out.println("Average: "+avg);
        sc.close();
    }
}
