package BinarySearch;

/**
 * Time complexity for binary search is O(logn)
 */
public class Floor {
    public static void main(String[] args) {
//        int arr[] = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {1,2,3,5,7};
        int target = 4;
        int ans = floor(arr,target);
        System.out.println(ans);

    }
    // return index of the greatest number that is smaller than or equal to target
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //what if the target is smaller than the smallest element in the array
        if(target<arr[0]){
            return -1;
        }

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid +1;
            }else {
                return arr[mid];
            }
        }
        return end;
    }
}
