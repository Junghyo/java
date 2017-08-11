/*
 # 객체 배열
 - 선언 : 기본데이터형 [] 이름 = new 기본데이터형[크기];
 ex) int [] points = new int[5];
 
 - 할당이름[index] = 할당할 데이터;
 ex) points[3] = 80; 
 
 - 선언과 할당 : 기본데이터형[] 이름 = new 기본데이터형[]{데이터1, 데이터2, ....}; 	-- new 기본데이터형은 생략가능
 ex) double[] weights = new double[]{67.5, 61.3, 70}; 	-- new double[]은 생략가능
 
*/

/*
 # 배열 복사
 - 배열은 자바의 API에 의해 복사처리 메서드가 지원된다. 
 objArray = {1, 2, 3}; copyArray ={1, 2, 3, 0, 0};
 index       0  1  2               0  1  2  3  4
 ex) System.arraycopy(objArray, int 원본시작위치, copyArray, int 복사본시작위치, int 전체길이);
*/


package a05_reference;

public class A03_Array_0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열의 선언
		int [] points;
		
		// 기본 크기가 선언된 배열객체 생성
		points = new int[5];
		
		// 배열 객체 데이터 할당
		points[0]= 90;
		points[1]= 80;
		points[3]= 70;
		
		// 해당 객체 호출	해당 배열에 데이터가 할당되지 않으면 0으로 자동 할당
		for(int idx=0; idx<points.length; idx++){
			System.out.println((idx+1)+"번째 숫자 : "+points[idx]);		
		}
		
		// 배열객체 선언, 데이터 할당
		double [] weights = new double[]{67.5, 70.112, 10, 30.123};
		// double [] weights = {67.5, 70.112, 10, 30.123}; 		new double[] 생략가능
		
		// 해당 객체 호출
		for(int idx=0; idx<weights.length; idx++){
			System.out.println((idx+1)+"번째 몸무게 : "+weights[idx]);
		}
		
		// 배열 복사. System.arraycopy(원본배열객체, int 원본시작index, 복사본배열객체, int 복사본시작index, int 복사할길이);
		int[] originArray={1, 3, 5};
		int[] copyArray= new int[5];
		System.arraycopy(originArray, 0, copyArray, 0, 3);
		System.out.println(copyArray[1]);
		System.out.println("복사된 배열");
		for(int idx=0; idx<copyArray.length; idx++){
			System.out.println("copyArray["+idx+"] : "+copyArray[idx]);
		}
		
		String[] fruits = {"사과", "바나나", "딸기"};
		String[] copyFruits = new String[5];
		System.arraycopy(fruits, 1, copyFruits, 3, 2);
		
		for(int idx=0; idx<copyFruits.length; idx++){
			System.out.println("copyFruits["+idx+"] : "+copyFruits[idx]);
		}
		
		for(String fruit : copyFruits){
			System.out.println("복사된 과일 : "+fruit);
		}
		
		

	}

}
