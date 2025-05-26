public class nestedloops {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            System.out.println(i+"th table");
            for(int j=1;j<=n;j++){
               int k=i*j;
               System.out.println(i + " * "+ j + " = " + k);
            }
        }
    }
}
