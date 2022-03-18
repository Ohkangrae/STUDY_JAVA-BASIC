package am;

public class Exam2 {

    /*
    변수명 짓기
    1. 영문 대소문자와 한글도 사용할수는 있다(한글 쓰지말자)
    2. 특수문자는 밑줄과 $만 사용할수 있다. 
    3. 숫자를 사용할수는 있지만 단 첫번째 글자로는 쓸수 없다. a1 1a(x)
    4. 이미 예약어로 지정된 단어는 사용할수 없다. int public...
    *. 영문 소문자로 시작하자 , 한글은 쓰지말
    *. 영어 단어를 2개상 사용할때는 새로운 다운어 첫 글자는 대문자로
       myClass, minVal, bestLoc... camel case
    상수명 짓기
    final int MY_DATA;  상수명은 대문자 그리고 언더바 snake case
    변수의 생존 기간
*/
    public static void main(String[] args) {
        int value1 = 3;
        {
            int value2 = 5;
            System.out.println(value1);
            System.out.println(value2);
        }  // value2가 사라진다. 블록 안에서 선언을 했기 때문에...
        System.out.println(value1);
        //System.out.println(value2);

        //형변환.캐스팅 casting

        float value5 = 1.2F; //실수형 float은 F를 붙여서 정의한다. 
        double value6 = 1.5; //실수형 dougle이 기본 실수 자료형

        double value7 = 5; // 자동 형변환

        System.out.println(value7);

        int value8 = (int)5.3; //수동 형변환
        System.out.println(value8);
        long value9 = (long)10;

        // 형변환은 자바가 자동으로 수행하는 자동 형변환과 개발자가 직접 형 변환을 수행해야하는 수동 형변환이 있다. 크기가 작은 자료형을 큰 자료형에 대입할때는 어떤 손실도 발생하지 않는다.
        // 따라서 작은 자료형을 큰 자료형에 담으면 개발자가 변환 코드를 넣어주지 않아도 자바가 자동으로 타입을 변환해주는데 이것을 업캐스팅이라고 한다. 
// double > float
//         자바에서 정수형 자료형 들과 그 크기를 순서대로
//          byte < short  < int  < long

// 0  main   {
// 1  int a = 3;
// 2    {
// 3        int b;
// 4        b= 5;
// 5    }
// 6    int c=7;
// 7    }

//    생성번호    소멸번호       생성번호    소멸번호    생성번호    소멸번호
// a     1           7     b       3         5     c     6           7


    }
}