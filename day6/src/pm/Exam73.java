package pm;

public class Exam73 {

	public static void main(String[] args) {
		// 명시적으로 this를 붙여야하는 경우
		X x = new X();
		x.init(2,3);
		System.out.println(x.m);
		System.out.println(x.n);
		
		Y y = new Y();
		y.init(2,3);
		System.out.println(y.m);
		System.out.println(y.n);

	}

}

class X{
	int m;		//자동으로 초기값이 0
	int n;		//자동으로 초기값이 0
	void init(int m, int n) {	//int m = 2, int n = 3
		m = m;
		n = n;
	}
}

class Y{
	int m;
	int n;
	void init(int m, int n) {	//2,3
		this.m = m;	//y.m = 2	// this 자리에는 호출한 객체명이 온다
		this.n = n;	//y.n = 3
	}
}