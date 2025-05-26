import java.util.Scanner;
class LargestofThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        System.out.println("NUM1: "+n1);
        System.out.println("NUM2: "+n2);
        System.out.println("NUM3: "+n3);
        if(n1>n2 && n1>n3){
            System.out.println("Greatest num is: "+n1);
        }else if(n2>n1 && n2>n3){
            System.out.println("Greatest num is: "+n2);
        }else{
            System.out.println("Greatest num is: "+n3);
        }
        sc.close();
    }  
}
