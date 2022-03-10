package pm;

public class Exam5 {

	public static void main(String[] args) {
		// 문자열 연산
//		String str1 = "안녕"+"하세요"+"!";
//		System.out.println(str1);
//		
//		String str2 = "반갑";
//		str2 += "습니다";
//		str2 += "!";
//		System.out.println(str2);
		
		//String 객체는 내용을 변경할 수 없기 때문에 메모리에는 각각의
		// 객체가 매번 생성이 된다. 처음 "안녕"+"하세요" 붙을때 객체가
		// 새롭게 만들어지고 "안녕하세요" + "!" 붙을 때 객체가 또
		// 생성된다. 최종적으로 마지막 객체의 위치값이 저장되게 된다.
		
		
		// 문자열 관련 메서드 정리
		
		// length() 문자열 길이
//		String str1 = "Hello Java";			// 빈칸도 글자로 count한다.
//		String str2 = "안녕하세요! 반갑습니다.";	// 한글, 영어 모두 한문자당 1개로 count한다.
//		System.out.println(str1.length());
//		System.out.println(str2.length());
//		System.out.println();
//		
//		// charAt() 문자열 검색
//		System.out.println(str1.charAt(1)); //인덱스 1위치의 문자를 검색
//		System.out.println(str2.charAt(1)); //인덱스 1위치의 문자를 검색
//		
//		// indexOf() 글자가 위치한 인덱스를 반환
//		System.out.println(str1.indexOf('a')); //앞에서부터 첫번째 등장하는 'a'가 위치한 인덱스 반환
//		System.out.println(str1.lastIndexOf('a')); //뒤에서부터 첫번째 등장하는 'a'가 위치한 인덱스 반환
//		
//		System.out.println();
//		
//		// String.valueOf 기본 자료형 -> 문자열 변환
//		String str3 = String.valueOf(2.3);
//		String str4 = String.valueOf(false);
//		System.out.println(str3);
//		System.out.println(str4);
//		
//		// concat() 문자열을 연결
//		String str5 = str3.concat(str4);
//		System.out.println(str5);
//		
//		// 대소문자 변환
//		
//		String str6 = "Java Study";
//		System.out.println(str6.toLowerCase());
//		System.out.println(str6.toUpperCase());
//		
//		// replace 문자열 변경
//		System.out.println(str6.replace("Study","공부"));
//		
//		// substring 문자열에서 슬라이싱
//		System.out.println(str6.substring(0,5)); // 0번째 부터 5미까지 슬라이싱
//		
//		// trim 여백제거
//		System.out.println("          austin        ".trim());
		
		// 문자열의 내용비교 : 문자열을 비교할때는 ==를 쓰지 말고 .equals() 를 사용하자.
//			String str2 = new String("Java");
//			String str3 = new String("Java");
//			String str4 = new String("java");
//		
//			System.out.println(str2 == str3);		// 글자 자체와는 상관 없이 같은 메모리 주소인지 여부를 확인한다.
//			System.out.println(str3 == str4);
//			System.out.println(str2 == str4);
//		
//			System.out.println(str2.equals(str3)); // 메모리의 위치와는 관계없이 글자 자체만을 비교한다.
//			System.out.println(str3.equals(str4));
//			System.out.println(str2.equals(str4));
//			System.out.println(str3.equalsIgnoreCase(str4)); // 대소문자와 상관없이 비교
//		
//		// 5개의 원소가 있는 1차원 배열의 모든 원소를 순서대로 출력하는 코드를 for-each 문을 사용하여 작성하세요
//		 int[] a = new int[]{1,2,3,4,5};
//			
//		for(int each: a) {
//			System.out.println(each);
//		}
			
			
		//b라는 이름의 2차원 배열 객체를 생성하세요	
			
//		1	3	5
//		7	9
		
//		int[][] b = {{1,3,5},{7,9}};
//		
//			
//		// 이중 for문을 사용하여 2차원 배열의 모든 원소를 출력하시오
//		// 단. 반드시 .length를 사용
//		
//		for(int i = 0; i < b.length; i++) {
//			for(int j = 0; j < b[i].length ; j++) {
//				System.out.println(b[i][j]);
//			}
//		}
			
			
//		 String str = "내 이름은 [홍길동]입니다. 나이는 [15]살입니다.";
		// 라는 문자열이 있을때 String 매서드를 사용하여 String name -> "홍길동" int age -> 15가 저장되도록
		// 코드를 작성하시오
		// 단 indexOf() lastIndexOf() substring() 반드시 한번이상 사용
		 
		String str = "내 이름은 [홍길동]입니다. 나이는 [15]살입니다.";
		 
		int name1 = str.indexOf('[')+1; 
		System.out.println(name1); 
		
		int age1 = str.lastIndexOf('[')+1;
		System.out.println(age1);
		
		System.out.println(str.substring(name1,+name1+3));
		System.out.println(str.substring(age1,+age1+2));
		

			

	}

}
