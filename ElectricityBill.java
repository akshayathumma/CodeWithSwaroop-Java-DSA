import java.util.Scanner;
class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noofunitsused=sc.nextInt();
        double bill=0;
        if(noofunitsused<=100){
            bill=noofunitsused*10;
        }else if(noofunitsused<=200){
            bill=100*10+(noofunitsused-100)*20;
        }else if(noofunitsused<=300){
            bill=100*10+100*20+(noofunitsused-200)*30;
        }else{
            bill=100*10+100*20+100*30+(noofunitsused-300)*40;
        }
        System.err.println("Electricity Bill: "+bill);
        sc.close();
    }
}
