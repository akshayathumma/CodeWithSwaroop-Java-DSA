public class pattern15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int spaces=n-i;
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            int stars=2*i-1;
            for(int j=1;j<=stars;j++){
                if(j==1||j==stars){
                System.out.print("* ");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        int m=5;
        for(int i=m-1;i>=1;i--){
            int spaces=m-i;
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            int stars=2*i-1;
            for(int j=1;j<=stars;j++){
                if(j==1||j==stars){
                System.out.print("* ");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
}
