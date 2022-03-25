package castingExam;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ac = new C();      // A ac = (A) new C();
		A ac2 = (A) new C(); // 업 캐스팅
		
		B bc = new C();
		
		B bb = new B();
		A a = bb; //A a = (A)bb; 업 캐스팅은 언제나 가능하다. 
		
		A aa = new A();
//		B b = aa; //B b = (B)aa; // 다운캐스팅 불가능....
//		C c = aa; //불가능
		
		B bd = new D();
		D d = (D) bd; //다운캐스팅 가능
		
		
		A ad = new D();
		B b1 = (B) ad;
		D d1 = (D) ad;
	}
}


class A{}
class B extends A{}
class C extends B{}
class D extends B{}