public class CharPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int chars=i;
            for(int j=1;j<=chars;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
