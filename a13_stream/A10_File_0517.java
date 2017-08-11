/*
 # 파일 입출력
 1) java.io.File 클래스
 	- 파일 : 크기, 속성, 파일이름 정보, 생성, 삭제
 	- 디렉토리: 생성, 디렉토리에 포함된 파일 리스트
 
 2) 생성
 	- File f01 = new File("경로명/파일명");
 	- 물리적인 파일이나 디렉토리가 생성되는 것이 아님. 해당 파일이 있으면 인식.
 	- .exists() : 현재 파일이나 디렉토리가 있는지 여부를 boolean(true/false)
 
 3) 메서드(생성/삭제)
 	- .createNewFile() : 물리적인 파일이나 디렉토리 생성
 	- .mkdir() : 물리적 디렉토리 생성
 	- .delete() : 파일 또는 디렉토리 삭제
 
 4) 메서드(정보)
 	- .canExecute() : 실행할 수 있는 파일 여부(boolean)
 	- .getName() : 파일의 이름을 리턴
 	- .getPath() : 전체 경로를 리턴
 	- .isFile(), isDirectory() : 파일/디렉토리 인지 여부
 	- .length() : 파일의 크기
 	- .list() : 디렉토리인 경우에 포함된 파일의 문자열배열
*/
package a13_stream;

import java.io.File;
import java.io.IOException;

public class A10_File_0517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File 객체 생성
//		1) 파일 생성 : 생성자에 입력(경로명과 파일명)
		String dir1="C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/test/";
		String dir2="C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/";
		String fname01="a01_file.txt";
		File f01 = new File(dir1+fname01);

		//		파일이 존재하는지 여부 check : .exists()		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		System.out.println("파일존재 여부: "+f01.exists());

		if( !f01.exists() ){
			try {
//				파일 생성 메서드 : .createNewFile()  IO발생(예외처리)				
				f01.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		2) 디렉토리 생성 : 생성자에 경로명 입력
		File dir01 = new File(dir1);
//		listFiles() : 디렉토리 내 파일 객체
		File[] files = dir01.listFiles();
		System.out.println("이름\t크기\t타입");
		for(File file:files){
//			getName() : 파일 이름
			System.out.print(file.getName()+"\t");
			
//			length() : 파일의 크기
			System.out.print(file.length()+"\t");
			
//			파일의 형태(dir/file)
//			isDirectory() : 디렉토리 여부
			if(file.isDirectory()){
				System.out.print("디렉토리\n");
			}else{
				System.out.print("파일\n");
			}
		}
		
		File dir02 = new File(dir2);
		File[] files2 = dir02.listFiles();
		System.out.println("이름\t크기\t타입");
		for(File file:files2){
			System.out.print(file.getName()+"\t");
			System.out.print(file.length()+"\t");
			if(file.isDirectory()){
				System.out.print("디렉토리\n");
			}else{
				System.out.print("파일\n");
			}
		}
	}
}

