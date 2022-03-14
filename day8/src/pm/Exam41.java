package pm;

public class Exam41 {

	public static void main(String[] args) {
		// 객체의 다형적 표현
		
		Human h = new Human();
		h.name = "홍길동";
		h.age = 13;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name = "성춘향";
		s.age = 16;
		s.studentID = 31312;
		s.eat();
		s.sleep();
		s.goToSchool();
//		s.goToWork();
		
		
		

	}

}
class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}
}


class Student extends Human{ // human클래스를 상속
	int studentID;
	void goToSchool() {}
}

class Worker extends Human{ // human클래스를 상속
	int workerID;
	void goToWork() {}
}