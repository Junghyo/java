/*
 # ���� �����
 1) java.io.File Ŭ����
 	- ���� : ũ��, �Ӽ�, �����̸� ����, ����, ����
 	- ���丮: ����, ���丮�� ���Ե� ���� ����Ʈ
 
 2) ����
 	- File f01 = new File("��θ�/���ϸ�");
 	- �������� �����̳� ���丮�� �����Ǵ� ���� �ƴ�. �ش� ������ ������ �ν�.
 	- .exists() : ���� �����̳� ���丮�� �ִ��� ���θ� boolean(true/false)
 
 3) �޼���(����/����)
 	- .createNewFile() : �������� �����̳� ���丮 ����
 	- .mkdir() : ������ ���丮 ����
 	- .delete() : ���� �Ǵ� ���丮 ����
 
 4) �޼���(����)
 	- .canExecute() : ������ �� �ִ� ���� ����(boolean)
 	- .getName() : ������ �̸��� ����
 	- .getPath() : ��ü ��θ� ����
 	- .isFile(), isDirectory() : ����/���丮 ���� ����
 	- .length() : ������ ũ��
 	- .list() : ���丮�� ��쿡 ���Ե� ������ ���ڿ��迭
*/
package a13_stream;

import java.io.File;
import java.io.IOException;

public class A10_File_0517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File ��ü ����
//		1) ���� ���� : �����ڿ� �Է�(��θ�� ���ϸ�)
		String dir1="C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/test/";
		String dir2="C:/a01_prog/eclipse/workspace_server/java_exp/src/a13_stream/";
		String fname01="a01_file.txt";
		File f01 = new File(dir1+fname01);

		//		������ �����ϴ��� ���� check : .exists()		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		System.out.println("�������� ����: "+f01.exists());

		if( !f01.exists() ){
			try {
//				���� ���� �޼��� : .createNewFile()  IO�߻�(����ó��)				
				f01.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		2) ���丮 ���� : �����ڿ� ��θ� �Է�
		File dir01 = new File(dir1);
//		listFiles() : ���丮 �� ���� ��ü
		File[] files = dir01.listFiles();
		System.out.println("�̸�\tũ��\tŸ��");
		for(File file:files){
//			getName() : ���� �̸�
			System.out.print(file.getName()+"\t");
			
//			length() : ������ ũ��
			System.out.print(file.length()+"\t");
			
//			������ ����(dir/file)
//			isDirectory() : ���丮 ����
			if(file.isDirectory()){
				System.out.print("���丮\n");
			}else{
				System.out.print("����\n");
			}
		}
		
		File dir02 = new File(dir2);
		File[] files2 = dir02.listFiles();
		System.out.println("�̸�\tũ��\tŸ��");
		for(File file:files2){
			System.out.print(file.getName()+"\t");
			System.out.print(file.length()+"\t");
			if(file.isDirectory()){
				System.out.print("���丮\n");
			}else{
				System.out.print("����\n");
			}
		}
	}
}

