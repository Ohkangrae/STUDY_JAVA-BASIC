package pm;

public class Exam72 {

	public static void main(String[] args) {
		// this 키워드  ( 파이썬 self )
		// 모든 매서드에는 자신이 포함된 클래스의 객체를 가리키는 this 가 있다.
		// this 는 생략이 가능하다. 묵시적으로 사용된다.
		// this. 생략해도 항상 자바 자동으로 추가해주므로 전혀 신경 쓸 필요가
		// 없어보이기도한다. 하지만 this.명시적으로 꼭 직접 붙여줘야 할때도 있다.
		
		Z z = new Z();
		z.work();
		System.out.println(z.m);
		System.out.println(z.n);

	}

}


class Z {
	int m;
	int n;
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;	//this 키워드를 생략하면 자동으로 추가된다.
		this.n = b;	//this 키워드를 생략하면 자동으로 추가된다.
	}
	void work() {
		this.init(2, 3);	//this 키워드를 생략하면 자동으로 추가된다.
	}
}