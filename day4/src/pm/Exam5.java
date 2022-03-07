package pm;

import java.util.Arrays;

public class Exam5 {

	public static void main(String[] args) {
		
//		 배열 생성 방법 세가지 총정리
//		 방법1
//		int[] array1 = new int[3];
//		array1[0] = 3;
//		array1[1] = 4;
//		array1[2] = 5;
//		
//		
//		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
//		
//		System.out.println();
//		System.out.println();
//		
//		
//		int[] array2;
//		array2 = new int[3];
//		
//		array2[0] = 3;
//		array2[1] = 4;
//		array2[2] = 5;
//		
//		System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
//		
//		System.out.println();
//		System.out.println();
//		
//		//방법2
//		int[] array3 = new int[] {3,4,5}; //초기화를 생략
//		System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);
//		
//		int[] array4 = new int[] {3,4,5}; //배열 선언과 객체 대입을 분리
//		System.out.println(array4[0] + " " + array4[1] + " " + array4[2]);
//		
//		//방법3
//		int[] array5 = {3,4,5};   //강제 초기화 생략
//		System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);
//		
//		
////		배열에서의 초기화 값 정리
////		int, long, short, char, byte - 0 으로 초기화
////		boolean - false로 초기화
////		float double - 0.0으로 초기화
////		String ..null
//		
//		
//		int value1;
////		System.out.println(value1); // 오류 초기값 없이 출력 불가능
//		int[] value2;
////		System.out.println(value2); // 오류 초기값 없이 출력 불가능
//		
//		int value3 = 0;		// 0으로 초기화하여 오류 미발생
//		System.out.println(value3);
//		
//		int[] value4 = null;		// null로 초기화하여 오류 미발생
//		System.out.println(value4);
		
		
		boolean[] array1 = new boolean[3];		//boolean은 false로 초기화
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		
		System.out.println();
		
		for(int i = 0; i < 3 ; i++) {
			System.out.println(array1[i]);
		}
		
		System.out.println();
		
		for(boolean j : array1) {
			System.out.println(j);
		}
		
		
		int[] array2 = new int[3];
		for (int each : array2) {
			System.out.println(each);
		}
		
		
		String[] array3 = new String[3];
		for (String str : array3) {
			System.out.println(str);
		}
		
		
		// 배열 전체를 출력하는 간단 방법
		// Arrays.toString(배열명)을 이용하면 배열의 모든 원소를 한번에 모두 출력
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		
		
		
		
		
		

	}

}
