package com.util.basic.sort;

public class MergeSort {
    public int[] sort(int[] arr) {
        int min = 0;
        int high = arr.length -1;
        int[] tempArray = new int[arr.length];
        breakArray(arr, tempArray, 0, arr.length -1);
        return tempArray;
    }

    private void breakArray(int[] arr, int[] temp, int min, int high) {
        if(min >= high) {
            return;
        }
            int mid = (min + high) / 2;
            breakArray(arr, temp, min, mid);
            breakArray(arr, temp,mid + 1, high);
            mergeArray(arr, temp, min, high);

    }
    private void mergeArray(int[] arr, int[] temp, int min, int high){
        int leftStart = min;
        int leftEnd = (min+ high)/2;
        int rightStart = leftEnd +1 ;
        int rightEnd = high;
        int index = leftStart;

         while(leftStart <= leftEnd && rightStart <= rightEnd){
             if(arr[leftStart] < arr[rightStart]){
                 temp[index] = arr[leftStart];
                 leftStart++;
             }
             else{
                 temp[index] = arr[rightStart];
                 rightStart++;
             }
             index++;
         }


             while(rightStart <= rightEnd){
                 temp[index] = arr[rightStart];
                 rightStart++;
                 index++;
             }


            while(leftStart <= leftEnd ){
                temp[index] = arr[leftStart];
                leftStart++;
                index++;
            }

            for(int i= min; i<= high; i++){
                arr[i] = temp[i];
            }

    }
}
