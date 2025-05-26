import java.util.Scanner;
class TotalCost {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float Costofpen = sc.nextFloat();
        float Costofpencil = sc.nextFloat();
        float Costoferaser = sc.nextFloat();
        float TotalCost = Costofpen+Costofpencil+Costoferaser;
        System.out.println("Total Cost without GST: "+TotalCost);
        float gstrate=sc.nextFloat();//given 18
        float gst=TotalCost*gstrate/100;
        float FinalCost=TotalCost+gst;
        System.out.println("Total Cost with GST: "+FinalCost);
        sc.close();

    }
    
}
