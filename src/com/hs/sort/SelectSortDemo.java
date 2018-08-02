package com.hs.sort;

/**
 * @author huangsen
 * 选择排序：在要排序的一组数中，选出最小的一个数与第一个位置的数交换；然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 *
 */

public class SelectSortDemo {
	
	public static void selectSort(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			int k = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j]<arr[k]) {
					k = j;
				}
			}
			if(k>i) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;		
				
			}
		}
		
	}

}
