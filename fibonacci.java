class fibonacci {
    public static void main(String[] args) {
        //fibonacci-A series of numbers in which each no is the sum of preceeding nos
        int n=10;
        int fno=0;
        int sno=1;
        int nno;
        for(int i=0;i<=n;i++){
            System.out.print(fno+",");
            nno=fno+sno;
            fno=sno;
            sno=nno;
        }
    }
}
