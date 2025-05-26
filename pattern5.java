public class pattern5 {
   public static void main(String[] args) {
    //upperpart
    int n=5;
    for(int i=1;i<=n;i++){
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //lowerpart
    int m=4;
    for(int k=m;k>=1;k--){
        for(int l=1;l<=k;l++){
            System.out.print("*");
        }
        System.out.println();

    }
   }
}
