package Sort;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr,int start,int end) {
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    public static void merge(int[] arr,int start,int mid,int end) {
        int[] temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
    while(i<=mid && j<=end) {
        if(arr[i]<=arr[j]) {
            temp[k++]=arr[i++];
        }
        else {
            temp[k++]=arr[j++];
        }
    }
    while(i<=mid) {
        temp[k++]=arr[i++];
    }
    while(j<=end) {
        temp[k++]=arr[j++];
    }
    for(k=0;k<temp.length;k++) {
        arr[start+k]=temp[k];
    }
    }
    
    public static void main(String[] args) {
        int[] arr = {1,7,6,5,1,3};
        int start=0;
        int end=arr.length-1;
        
        mergeSort(arr,start,end);
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
}
