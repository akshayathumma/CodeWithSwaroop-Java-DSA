import java.util.Scanner;

public class votemethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        voteeligibility(age);
        sc.close();
    }
    static void voteeligibility(int a){
        if(a>=18){
            System.out.println("Age is "+a+", hence he/her can vote.");
        }else{
            System.out.println("Age is "+a+", hence he/her cannot vote.");
        }
    }
}
