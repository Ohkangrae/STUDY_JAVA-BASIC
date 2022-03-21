package pm;

public class Exam13 {
    /* this 키워드
    모든 매서드는 자신이 포함된 클래스이 객체를 가리키는 this 참조 변수
    가 있다. 
    this. 을 생략해도 항상 자바가 추가해주기때문에 굳이 신경을 쓸 필요가
    없어 보이지남 this. 명시적으로 꼭 붙여줘야 할때가 있다. 
    */
    public static void main(String[] args) {
        P p = new P();
        p.work();
        System.out.println(p.m);
        System.out.println(p.n);
    }
}

class P {  // 생성자는 자바가 자동으로 기본 생성자를 작성해준다. 
    int m;
    int n;
    void init(int a, int b) {
        int c;
        c = 3;
        this.m = a;  // this. 를 생략하면 자동으로 자바가 붙여준다. 
        this.n = b;  // this. 를 생략하면 자동으로 자바가 붙여준다. 
    }
    void work() {
        this.init(2,3); // this. 를 생략하면 자동으로 자바가 붙여준다. 
    }
}