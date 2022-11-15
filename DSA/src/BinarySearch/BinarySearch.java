package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 222;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

    //return the index
    //return -1 if doesn't exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
//            int mid = (start+end)/2 ;//this fails when int max size is reached
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
