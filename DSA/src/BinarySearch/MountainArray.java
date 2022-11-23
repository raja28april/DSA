package BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/submissions/
public class MountainArray {
    public static void main(String[] args) {
    int[] arr = {0,10,5,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
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

}
