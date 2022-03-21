package pm;


public class Exam14 {

    // this 매서드

    // this 키워드와 매우 비슷해보이지만 의미가 전혀 다르다. 
    // this()매서드는 자신이 속한 클래스 내부의 다른 생성자를 호출한다. 
    // this() 매서드의 특징
    // 1. 생성자의 내부에서만 사용된다. 
    // 2. 생성자의 첫 줄에서만 사용한다. 
    // 이 두개의 규칙 중 하나라도 지켜지지 않으면 오류가 발생된다. 

    public static void main(String[] args) {
        
   
    Y y = new Y();
    System.out.println();
    Y y3 = new Y(3);
}
}


class Y {
    Y() {  //기본 생성자
        System.out.println("첫번째 생성자");
    }
    Y(int a) {
        this(); // 첫줄에 위치한다. 
        System.out.println("두번째 생성자");
    }
}