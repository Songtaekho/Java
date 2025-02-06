package day05;

import java.util.Arrays;

public class MethodEx04 {
	
	public static void main(String[] args) {
		
		//배열을 매개변수로 전달할 수 있을까? YES
	
		int[] arr = {1,2,3,4};
		inputArray(arr);
		
		//배열을 반환하는 매서드
		int[] arr2 = returnArray();
		System.out.println(Arrays.toString(arr2));
	}
	
	static void inputArray(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("배열의 합:" + sum);
	}
	
	static int[] returnArray() {
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		return arr;
	}
	
//	//배열을 매개변수로 받는 매서드 모형
//	
//	static void inputArray(int[] arr) {
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
//	
//	//배열을 반환하는 매서드 모형
//	
//	static int[] returnArray() {
//		
//		//어떻게든 배열을 만들어서, 변수명으로 리턴하면 됨
//		int[] arr = new int[3];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		
//		return arr;
//	}
}
