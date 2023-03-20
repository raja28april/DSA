package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {5,2,4,3,1};
        int[] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr) {
        boolean swapped = true;
    for(int i=0;i<arr.length;i++){
        swapped = false;
        //for each step, max item will come at the last respective index
    for(int j=1;j<arr.length-i;j++){
        //swap if the item is smaller than the previous item
        if(arr[j]<arr[j-1]){
            //swap
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1]=temp;
            swapped = true;
        }
    }
    if(!swapped){
        break;
    }
    }
    }
}
