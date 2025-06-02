public class BinarySearch {
    public static void main(String[] args) {
        /*
        1.Array should be sorted.
        2.mid,last,first elements 
        */
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int k=6;
        int index=search(arr,k);
        System.out.println(index);
    }
    static int search(int[] arr,int k){
       int mid,low=0,high=arr.length-1;
       while(low<=high){
        mid=(high+low)/2;
        if(arr[mid]==k){
            return mid;
        }else if(arr[mid]<k){
            low=mid+1;
        }else if(arr[mid]>k){
            high=mid-1;
        }
       }
        return -1;
    }
}
