package com.hs.sort;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.next();
			String[] str = s.split(",");
			int[] arr = new int[str.length];
			for (int i = 0; i < str.length; i++) {
				arr[i] = Integer.valueOf(str[i]);

			}

			System.out.println("原数组为：");
			PrintArr.printArray(arr);
//	        QuickSortDemo.quickSort(arr, 0, arr.length - 1);
//			InsertSortDemo.insertSort(arr);
//			SelectSortDemo.selectSort(arr);
			MergeSortDemo.mergeSort(arr, 0, arr.length - 1);
			System.out.println();
			System.out.println("快速排序后数组为：");
			PrintArr.printArray(arr);
		}
	}

}
