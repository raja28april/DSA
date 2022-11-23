package BinarySearch;
//https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountainArr {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstCry = orderAgnosticBinarySearch(arr,target,0,peak);
        if(firstCry!=-1){
            return firstCry;
        }

        //search in second part of the array
        return orderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;

        while (start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                //you are in dec area
                //this may be the answer but look at left
                end=mid;
            }else{
                //you are in asc part of the array
                start = mid +1;//because we know that mid+1 element is greater than mid element
            }
        }
//    in the end , start == end, pointing to the largest number because of the 2 check above
        // start and end are always trying to the find the max elemnent in the above 2 checks
        // hence when they are pointing to one element, then that is the maximum one, because that is what the checks say
        //more elaboration: at every point of time or start and end they have the best possible answer
        //and if we are saying that only one item is remaining, hence, cuz of above line that is the best possible answer
        return start;// or return end as both are equal
    }

    static int orderAgnosticBinarySearch(int[] arr, int target,int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target==arr[mid]){
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
