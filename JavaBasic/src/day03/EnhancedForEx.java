package day03;

import day01.SystemOut;

public class EnhancedForEx {

	public static void main(String[] args) {
		
 		int [] arr = {1,2,3,4,5};
//		//일반 반복문
//		for(int i = 0; i < arr.length; i++) {
//		System.out.println(arr[i]);
//	}
		
		
		//향상된 포문
		for(int a : arr) {
			System.out.println(a);
		}
		
		System.out.println("----------------------------------------");
		
		String [] arr2 = {"월","화","수","목","금","토","일"};
		for(String day : arr2) {
			System.out.println(day);
		}
		
		System.out.println("----------------------------------------");
		
		int sum = 0;
		int [] point = {34, 56, 12, 96, 98};
		for(int b : point) {
			sum += b;
		}
		System.out.println("합:"+ sum + "평균값:" + (double)sum/point.length);
		
	}
}