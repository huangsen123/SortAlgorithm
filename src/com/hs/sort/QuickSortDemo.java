package com.hs.sort;

import java.util.Scanner;

/**
 * @author huangsen
 * 快速排序
 * 1、先从一个数组中取出一个数作为基准数
 * 2、然后分区过程中将比这个数大的放在右边，小的放在左边
 * 3、重复步骤2对左右区间继续分区，直到每个区间只有一个数
 */

public class QuickSortDemo {
	
	public static void quickSort(int [] arr, int low, int high) {
	  if(high > low) {
		int temp = arr[low];
		int i = low;
		int j = high;
		while(j>i) {
			while((j >i) && (arr[j] > temp)) {
				j--;
			}
			if(j>i) {
		       arr[i] = arr[j];
               i++;
			}
        	while((j >i) && (arr[i] < temp)) {
        		i++; 		
        	}
        	if (j>i) {
        		arr[j] = arr[i];
        		j--;
        	}
		}
		arr[i] = temp;
		quickSort(arr, low, i-1);
		quickSort(arr, i+1, high);
	  }
				
	}
	

}
