import java.util.Scanner;
class Ternary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        System.out.println("NUM1: "+n1);
        System.out.println("NUM2: "+n2);
        System.out.println("NUM3: "+n3);
        String largest="";
        largest=(n1>n2 && n1>n3) ? "NUM1":(n2>n1 && n2>n3) ? "NUM2":(n3>n1 && n3>n2) ? "NUM3":"";
        System.out.println(largest);
        //System.out.println((n1>n2 && n1>n3) ? "NUM1":(n2>n1 && n2>n3) ? "NUM2":(n3>n1 && n3>n2) ? "NUM3":""); gives same output.
        sc.close();
    }  
}