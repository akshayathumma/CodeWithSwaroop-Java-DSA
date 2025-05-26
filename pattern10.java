public class pattern10 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
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
