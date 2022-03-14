package pm;

public class Exam51 {

	public static void main(String[] args) {
		// 메서드 오버 라이딩 method overriding 
		// 메서드 덮어쓰기
		// 부모 클래스에게 상속 받은 매서드와 동일한 이름의 매서드를 재 정의하는 것
		// 1. 부모 클래스의 매서드와 타입과 갯수가 완전히 동일해야 한다. 
		// 2. 보모 클래스의 매서드 보다 접근 지정자의 범위가 같거나 넓어야 한다. 
/*		
class A {
	void print() {
		System.out.println("A클래스");
		}
		}
class B extends A {
	void print() {
		System.out.println("B클래스");
		}
		}
		
		오버라이딩을 덮어쓰기라고 표현은 했지만 사실 차이가 있다. 
		덮어쓰기는 이전 내용이 완전히 삭제되고 새로운 내용으로 바뀌는 개념이지만
		오버라딩은 이전 print() 매서드 위에 새로운 매서드가 올라타는 개념이다. 
		사실은 부모의 print()매서드를 강제로 호출할수도 있다. 
		
		메서드 오버라딩을 사용하는 이유
		              class Animal {
		              	void cry() {}
		              	}
		              	
class Bird extends Animal {
	void cry() {
	System.out.println("짹쨱")};
	}
class Cat extends Animal {
	void cry() {
	System.out.println("야옹")};
	}	
class Dog extends Animal {
	void cry() {
	System.out.println("멍멍")};
	}		
	
Bird bird = new Bird();
Cat cat = new cat();
Dog dog = new dog();
bird.cry(); //쨱짹
cat.cry();  //야옹
dog.cry();  //멍멍
		
		
Animal bird = new Bird();
Animal cat = new cat();
Animal dog = new dog();
bird.cry(); //쨱짹
cat.cry();  //야옹
dog.cry();  //멍멍
모든 객체를 부모 타입 한가지로 선언하면 배열로 한번에 관리 할수 있는 장점이 있다. 
Animal[] animals = new Animal[] {bird, cat, dog};
		*/
		
		Q q = new Q(); //Q 자료형 / Q 생성자
		q.print();
		
		W w = new W(); //W 자료형 / W 생성자
		w.print();
		
		Q qw = new W();//Q자료형 / W 생성자
		qw.print();
	}

}


class Q {
	void print() {
		System.out.println("Q클래스");
		}
		}
class W extends Q {
	void print() {
		System.out.println("W클래스");
		}
		}