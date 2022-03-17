package pm;

public class Exam51 {

	public static void main(String[] args) {
/* abstract 추상 - 구체적이지 않다
 abstract method - 중괄호가 없는 매서드, 매서드의 기능이 정의되지 않는다. 그냥 ; 끝난다. 
 		              
 		              abstract 리턴타입 매서드명();
 
 class Animal {
 	void cry() {
	}  //기능을 구현하지 않음 -> 추상 매서드로 정의하는 것이 효율적이다. 
}                          추상 매서드를 포함하는 클래스는 반드시 추상 클래스로 정의해야 한다. 
                                                   추상 클래스도 클래스 이므로 상속도 할수 있다. 
                                                   추상 클래스로는 객체를 생성할수는 없다.
                                                                                              
class Cat extends Animal {
	void cRy() {
		System.out.println("야옹");
	}
}
class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}
Animal animal1 = new Cat();
animal1.cry(); //야옹
Animal animal2 = new Dog();
animal2.cry(); //멍멍
다형적 표현을 사용할때도 cry()매서드를 호출한다. 
추상 매서드 사용의 장점
일반 클래소 정의 했을때와 추상 클래스로 정의 했을때
자식 클래스에서 cry() 매서드를 오버라이딩 하는 과정에서 만약에 매서드명에
오타가 발생됐다고 가정했을때 cRy()...
이때 일반 클래스를 상속한 자식 클래스에서는 오버라딩이 아니라 추가로 새로운 매서드를 정의한 결과가
된다. 따라서 cry() cRy() 2개의 매서드가 존재하게 된다. 이런 경우 객체를 생성하고
cry()매서드를 호출해도 아무것 출력되 않는다.부모의 cry()매서드에는 아무것도 정의되지 않았기
때문이다. 
추상 클래스를 생각해보면...
자식 클래스가 오버라이딩 하려고하는 과정에서 오타가 발생하면 문법오류가 발생한다. 
추상 클래스를 상속받으면 추상 클래스에 정의해 놓은 추상 매서드들을
구체화한 클래스를 만들어야만한다. 메서드 오버라이딩을 강제하는 방식으로 생각하자 
겨우 오타찾는 정도의 장점이라고 가볍게 볼수도 있겠지만 여러사람들이나 여러회사들이 
협업을 하게되는 경우 많은 필요성을 느끼게 될것이다. 
정리...
만약 abc()라는 추상 매서드를 포함하고 있는 추상 클래스가 있을때 '이것을 상속한
모든 자식 클래스들 내부에는 항상 반드시 abc()매서드가 정의되 있어야만 한다.라는
사실을 보장하게 되는것이다. 
*/
		
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();
		
	}

}

abstract class Animal {   //추상 클래스 선언
	abstract void cry();  //추상 매서드 선언
}

class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}