public class linearsearch {
    public static void main(String[] args) {
        int[] arr={3,5,4,2,7,8,9,0,5};
        int target=8;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Target found at index: "+i);
                break;
            }
        }
    }
}
