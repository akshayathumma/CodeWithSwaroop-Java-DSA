public class pattern8 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int spaces=n-i;
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            int stars=2*i-1;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
             System.out.println();
        }
    }
}
