package am;

import java.util.Arrays;

public class Exam7 {
    public static void main(String[] args) {
        //배열은 동일한 자료형을 묶어 저장하는 자료형이다. 
        //배열은 생성할때 지정된 크기를 수정할 수 없다. 

            //배열 생성
        int[] arr1 = new int[3];
        int[] arr2;
        arr2 = new int[3];

        String[] str1 = new String[3];

            // 배열 값 넣기
        arr1[0] = 1;
        arr1[1] = 2;
        str1[0] = "hi";

        String[] str2 = {"hi","Hello"};


            // 배열 꺼내기
        for (String each:str2) {
            System.out.println(each);
        }


        System.out.println(str2.length); //배열의 길이 구하기 

        System.out.println(Arrays.toString(str2));
    }
}