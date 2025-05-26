public class pattern3 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int stars=n-i+1;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
