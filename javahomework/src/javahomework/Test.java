package javahomework;

public class Test {

	public static void main(String[] args) {
		
		new Test().start();
	}

public void start() {

    int[] arrA = {7,3,8,-4,11,-19,21};

    int[] arrB = {6,13,-7,0,-5};

    int[] arrSum;
    

    arrSum = mergeArrays(arrA, arrB);            // 배열 합치기
    ascList(arrSum);                            // 오름차순 정렬
    printList(arrSum);                            // 결과 출력
}
// 배열 합치는 메서드

public int[] mergeArrays(int[] arrA, int[] arrB) {

    int sumLength = arrA.length+arrB.length;
    int[] arrSum = new int[sumLength];
    for(int i=0; i<sumLength; i++) {
        if(i<arrA.length) {
            arrSum[i] = arrA[i];   
        }else {
            arrSum[i] = arrB[i-arrA.length];
        }
    }
    return arrSum;
}//end mergeArrays()
// 오름차순 정렬 메서드
public void ascList(int[] arr) {
    for(int i=arr.length-1; i>=0; i--) {
        for(int j=0; j<i; j++) {
            if(arr[j]>arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }   
        }
    }//end for
}//end ascList()
// 결과 출력 메서드
public void printList(int[] list) {

    System.out.print("결과물 -> 배열C = { ");
    for(int i=0; i<list.length-1; i++) {
        System.out.print(list[i]+ ", ");
    }
    System.out.println(list[list.length-1] + " }");
}//end printList()



		
	
}



