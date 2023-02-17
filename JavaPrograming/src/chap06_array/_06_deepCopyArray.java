package chap06_array;

public class _06_deepCopyArray {

	public static void main(String[] args) {
		
		//1. clone() 메소드를 이용한 깊은 복사
		int[] arr1 = {1, 2, 3, 4, 5};
		
		int[] arr2 = arr1.clone();
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		//값을 변경해도 서로의 배열에 영향x
		arr1[0] = 10;
		arr2[0] = 30;
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println("------------");
		
		
		//2. System.arraycopy() 메소드를 이용한 깊은 복사
		//arraycopy(복사될 원본 배열이름, 복사를 시작할 인덱스, 복사해서 사용할 배열이름, 복사할 배열을 넣을 시작인덱스, 복사할 길이)
		int[] arr3 = new int[5];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		System.out.println(arr1);
		System.out.println(arr3);
		
		arr1[1] = 13;
		arr3[1] = 16;
		
		System.out.println(arr1[1]);
		System.out.println(arr3[1]);
		
		
	}

}
