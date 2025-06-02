public class LargestinArr {
    public static void main(String[] args) {
        int[] arr={3,5,4,6,3,7,1,9,4,34,65,77,99,22,3223};
        int max=0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            max=Math.max(max,curr);
        }
        System.out.println("Largest no in array: "+max);
    }
}
