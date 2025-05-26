import java.util.Scanner;
class Grades {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Score: "+n);
        if(n>=90){
            System.out.println("A grade");
        }else if(n>=80){
            System.out.println("B grade");
        }else if(n>=70){
            System.out.println("C grade");
        }else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
