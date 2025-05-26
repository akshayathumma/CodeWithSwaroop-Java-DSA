import java.util.Scanner;
public class pythagoreantriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        triplet(a,b,c);
        sc.close();
    }
    static void triplet(int a,int b,int c){
        if((a*a+b*b)==c*c){
            System.out.println("Given triplet is pythagoreantriplet");
        }else{
            System.out.println("Given triplet is not a pythagoreantriplet");
        }
    }
}
