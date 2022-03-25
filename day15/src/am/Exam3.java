package am;

public class Exam3 {
/*
 Quiz 1  class D 를 만드세요 ( 매서드 오버로딩)
 
 Quiz 2 int[] 객체를 입력 받아서 그 배열의 모든 원소를 합하여 결과를 리턴하는 
 		arraySum()매서드를 만드세요 (class F)
 
 
 D d = new D();
 
 d.print();     //->입력값이 없습니다.
 d.print(3);    //->정수 입력값 : 3
 d.print(5.8);  //->실수 입력값 : 5.8
 d.print("안녕");//->문자열 입력값 : 안녕
 
 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 D d = new D();
//		 
//		 d.print();     //->입력값이 없습니다.
//		 d.print(3);    //->정수 입력값 : 3
//		 d.print(5.8);  //->실수 입력값 : 5.8
//		 d.print("안녕");//->문자열 입력값 : 안녕
		
		F f = new F();
		
		int[] data1 = new int[] {1,2,3};
		int[] data2 = {1,2,3};
		
		System.out.println(f.arraySum(data1));
		System.out.println(f.arraySum(data2));
		
		System.out.println(f.arraySum({1,2,3}));
		System.out.println(f.arraySum(new int[] {1,2,3}));

	}
	
//	변수에 객체를 받아야 하는데 배열을 선언해주지 않아서??

	//주소값이 생성이 안돼서?
	
//배열 선언이 없어서?

//매개변수로 int[] 객체를 받아야하는데 new없이 {1,2,3}이 객체로 생성되는건 
// 배열을 선언과 동시에 초기화할때만 가능해서?

	
//	자바는 선언을 해줘야하는데 {1,2,3}은 안 해줬습니다
//	나머지는 선언해서 변수에 넣었으니 되는거구요

//데이터 타입을 지정안해줘서?
	
//객체생성이 제대로 안돼서?

//에러나는건 그냥 배열자료형으로만 인식하고 아래꺼는 new를 써서 자바가 객체로 인식을 하는거 아닐까요

}

class F {
	int arraySum(int[] array) {
		int sum = 0;
		for(int each: array) {
			sum += each;
		}
		return sum;
	}
}

class D {
	void print() {
		System.out.println("입력값이 없습니다.");
	}
	void print(int a) {
		System.out.println("정수 입력값 : " + a);
	}
	void print(double a) {
		System.out.println("실수 입력값 : " + a);		
	}
	void print(String a) {
		System.out.println("문자열 입력값 : " + a);
	}
}