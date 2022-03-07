package pm;

public class Exam6 {

	public static void main(String[] args) {
							//여러개의 String 객체를 묶어 저장한다
		
		
/* 배열의 특징
 먼저 기본 자료형과 참조 자료형에서 변수를 복사할때를 생각해보자.
대입 연산자(=)를 이용해서 변수가 복사되는 과정을 이해해 보자
'변수의 복사'라는 말의 의미는 무엇일까..바로 변수에 포함된 메모리 값이다. 
그런데 기본 자료형과 참조 자료형의 저장되는 메모리 값의 의미가 다르다. 따라서
둘 사이에 차이가 발생된다. 
그럼 기본 자료형을 살펴보자. 기본 자료형은 메모리에 실제 데이터 값을 저장한다. 
따라서 기본 자료형 변수를 복사하면 실제 데이터 값이 1개 더 복사된다. 
이후 복사된 값을 아무리 변경해도 원본 값은 아무런 영향을 받지 않는다. 
		int a = 3;
		int b = a;
		b = 7;
		
		System.out.println(a);  //3
		System.out.println(b);  //7
		
이제 참조 자료형을 살펴보자. 참조 자료형은 실제 데이터 값이 아닌 저장된 위치값을 
가지고 있다. 따라서 참조 자료형 변수를 복사하면 실제 데이터가 복사되는 것이 아니라
실제 데이터의 위치값이 복사된다. 
		
	
		int[] a = {3,4,5};
		int[] b = a;
		b[0] = 7;
		
		System.out.println(a[0]);
		System.out.println(b[0]);
		
		
		
		
		
		int[] a = new int[] {3,4,5,6,7};
		System.out.println(a.length);
		
		for (int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i]);
		}
		
		for (int each : a) {
			System.out.println(each);
		}
		
2차원 배열 : 가로와 세로 2차원으로 데이터를 저장하는 배열
		  배열의 선언을 보면 차원이 1개씩 늘어날때 마다 대괄호가 1개씩 늘어난다. 
		 배열의 위치  표현은 세로 방향으로 숫자가 늘어나는 행row번호
		 가로 방향으로 숫자가 늘어나는 혈column번호로 구성된다. 
		
자료형[][] 변수명;		자료형 변수명[][];		자료형[] 변수명[];
				*/	
		//2차원 배열 생성 방법1
//		int[][] array1 = new int[3][4];
//		int[][] array2;
//		array2 = new int[3][4];
//		
//		//2차원 배열 생성 방법2
//		int array3[][] = new int[3][4];
//		int array4[][];
//		array4 = new int[3][4];
//		
//		//2차원 배열 생성 방법3
//		int[] array5[] = new int[3][4];
//		int[] array6[];
//		array6 = new int[3][4];
		
//		
//		int[][] array1 = new int[2][3];
//		array1[0][0] = 1;
//		array1[0][1] = 2;
//		array1[0][2] = 3;
//		array1[1][0] = 4;
//		array1[1][1] = 5;
//		array1[1][2] = 6;
//		
//		System.out.println(array1[0][0]);
//		
//		
		int[][] a = {{1,2},{3,4,5}};
		
//		for (int i = 0 ; i < a.length ; i++) {
//			for(int j= 0 ; j < a[i].length ; j++) {
//				System.out.println(a[i][j]);
//			}
//		}
		
		
		for(int[] array: a) {
			for(int k: array) {
				System.out.print(k +" ");
			}
			System.out.println();
		}
		
		
	}

}