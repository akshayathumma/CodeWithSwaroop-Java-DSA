import java.util.Scanner;
public class gradesmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        Grade(marks);
        sc.close();
    }
    static void Grade(int a){
        if(a<100 && a>90){
            System.out.println("Grade for "+a+" marks is AA");
        }else if(a<=90 && a>80){
            System.out.println("Grade for "+a+" marks is AB");
        }else if(a<=80 && a>70){
            System.out.println("Grade for "+a+" marks is BB");
        }else if(a<=70 && a>60){
            System.out.println("Grade for "+a+" marks is BC");
        }else if(a<=60 && a>50){
            System.out.println("Grade for "+a+" marks is CD");
        }else if(a<=50 && a>40){
            System.out.println("Grade for "+a+" marks is DD");
        }else{
            System.out.println("Grade for "+a+" marks is Fail.");
        }
    }
}
