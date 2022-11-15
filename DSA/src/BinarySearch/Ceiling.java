package BinarySearch;

public class Ceiling {

    public static void main(String[] args) {
//        int arr[] = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {1,2,3,5,7};
        int target = 4;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
// return the index of smallest number that is greater than or equal to target
    static int ceiling(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        //but what if the target is greater than the greatest element in the array
        if(target>arr[arr.length-1]){
            return -1;
        }

        while(start<=end){
           int  mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid +1;
            }else {
                return arr[mid];
            }
        }
        return start;
    }
}
