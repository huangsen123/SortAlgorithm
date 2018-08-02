package com.hs.sort;

/**
 * 
 * @author huangsen
 * 插入排序：一个有序数组，一个无序数组，将无序数组插入到有序数组中
 *
 */

public class InsertSortDemo {
	
	public static void insertSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j;
			for(j = i -1; j>=0; j--) {
				if(temp > arr[j]) {
					break;									
				}else {
					arr[j+1] = arr[j];
				}
				
			}
			arr[j+1] = temp;
		}
		
	}
		
}
