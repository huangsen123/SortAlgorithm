package com.hs.sort;

/**
 * 
 * @author huangsen
 * 归并排序：采用分治思想，对一个数组的排序，我们可以将他分成两个数组来处理，再对这两个数组同样的道理来处理，
 * 将他们分别分成两个数组来处理…… 直到数组无法再细分下去（即数组的长度为1，只有一个元素的数组肯定是有序的），
 * 分为之后的数组进行合并操作，向上整合整个数组，最后到达得到一个有序的数组的目的。
 *
 */

public class MergeSortDemo {
	public static void mergeSort(int[] arr, int start, int end) {
		if(start<end) {
			int mid = (start + end)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr,mid + 1, end);
			merge(arr, start, mid, mid + 1, end);
			
		}
		
	}
	
    public static void merge(int[] arr, int start1, int end1, int start2, int end2) {
    	int i = start1;
    	int j = start2;
    	int k = 0;
    	int[] a = new int[end2-start1+1];
     	while((i<=end1) && (j<=end2)) {
    		if(arr[i]<arr[j]){
    			a[k] = arr[i];
    			k++;
    			i++;		
    		}else {
    			a[k] = arr[j];
    			k++;
    			j++;		
    		}		
    	}
     	while(i<=end1) {
			a[k++] = arr[i++];
			
		}
		while(j<=end2) {
			a[k++] = arr[j++];
			
		}
		for(int m = 0; m<a.length; m++)
			arr[m+start1] = a[m];
    	
    }

}
