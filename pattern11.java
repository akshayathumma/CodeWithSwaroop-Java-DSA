public class pattern11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            //spaces
            int spaces=n-i;
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            //stars
            int stars=i;
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
