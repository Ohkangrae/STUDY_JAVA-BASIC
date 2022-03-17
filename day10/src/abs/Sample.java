package abs;

//interface PredatorBarkable extends Predator, Barkable {
//	
//}

abstract class Predator extends Animal{
	abstract String getFood();
	
	void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
	
	static int LEG_COUNT = 4;
	
	static int speed() {
		return LEG_COUNT * 30;
	}
}

interface Barkable {
	void bark();
}


class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
		
	}
}

class Tiger extends Predator implements Barkable{
	public String getFood() {
		return "apple";
	}
	
	public void bark() {
		System.out.println("어흥");
	}
}

class Lion extends Predator implements Barkable {
	public String getFood() {
		return "banana";
	}
	
	public void bark() {
		System.out.println("으르렁");
	}
}

//class Crocodile extends Animal implements Predator, Barkable {
//	public String getFood() {
//		return "strawberry";
//	}
//}
//
//class Leopard extends Animal implements Predator, Barkable {
//	public String getFood() {
//		return "orange";
//	}
//}



class ZooKeeper {
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
//	void feed(Predator tiger) {
//		System.out.println("feed apple");
//	}
//	void feed(Predator lion) {
//		System.out.println("feed banana");
//	}
//	
//	void feed(Predator crocodile) {
//		System.out.println("feed strawberry");
//	}
//	void feed(Predator leopard) {
//		System.out.println("feed orange");
//	}
}

class Bouncer {
	void barkAnimal(Barkable animal) {
		animal.bark();
//		if(animal instanceof Tiger) {// Tiger 클래스로 생성한 인스턴스니?
//			System.out.println("어흥");
//		} else if (animal instanceof Lion) {// Lion 클래스로 생성한 인스턴스니?
//			System.out.println("으르렁");
//		}
	}
}

public class Sample {

	public static void main(String[] args) {

//		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger(); 
		Lion lion = new Lion();
//		zooKeeper.feed(tiger);//매서드 오버로딩
//		zooKeeper.feed(lion);
		Bouncer bouncer = new Bouncer();
		
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
	}

}