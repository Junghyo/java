/*
 # String �޼ҵ�
 - charAt(index) : Ư�� ��ġ ���� ����
 - equals() : ���ڿ� ��
 - getBytes("���ڵ�") : byte[]�� ����
 - indexOf(�˻����ڿ�) : ���ڿ��� �ִ� ��ġ����
 - length() : �� ������ ��
 - replace('������ ��� ����', '����� ����')
 - substring(���� index, ������ index) : Ư�����ڿ� ������ ����
 - toLowerCase(), toUpperCase()
 - trim() : �յ� ������ ����
*/
package a10_api;

import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

public class A07_string_Method_0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eng = "ABCDEFGHIJKLMN";
		String kr= "�����ٶ󸶹ٻ�";
		System.out.println("charAt(index): "+eng.charAt(5));
		System.out.println("charAt(index): "+kr.charAt(5));
		
//		.getBytes() : ���ڿ��� ���� byte[]�� ��ȯ. keycode�ϰ� ����???
		for(byte bt : eng.getBytes()){
			System.out.println(bt+":"+(char)bt);
		}
		
		try {
			for(byte bt : kr.getBytes("utf-8")){
				System.out.println(bt+":"+(char)bt);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		.indexOf("ã�� ���ڿ�")
		System.out.println("indexOf(GHI): "+eng.indexOf("GHI"));
		System.out.println("indexOf(�ٶ�): "+kr.indexOf("�ٶ�"));

//		.length() : ���ڿ��� ����
		System.out.println("length(): "+eng.length());
		System.out.println("length(): "+kr.length());

//		replace : json --> �����, \, +, ''
		System.out.println("replace(): "+eng.replace("ABC","XYZ"));
		System.out.println("replace(): "+kr.replace("�󸶹�","ȣ����"));
		
//		.substring() : Ư�� ���ڿ� ����
		System.out.println("substring(): "+eng.substring(3, 5));
		System.out.println("substring(): "+kr.substring(4, 7));
		
//		StringTokenizer
//		split("������") ���ڿ��� �ش籸���ڷ� �����ؼ� �迭ȭ ��Ŵ
		String data="ȣ����&4��Ÿ��&���̽�&¯¯��";
		String names[]=data.split("&");
		for(String name:names){
			System.out.println(name);
		}
	
//		StringTokenizer(���ڿ�, ������)
		StringTokenizer st = new StringTokenizer("����/�ٸ���/����/ÿ��","/");
//		countTokens() : �����ڸ� ���ؼ� ��Ÿ�� ������ �Ǽ�

//		nextToeken() : �����ڸ� ���� ��Ÿ�� �� ������
		String data01="";
//		nextToken()�� ���� countTokens()�� ����Ǳ⿡ �ʱ⿡ �̸� �̾Ƽ� ������Ų��.		
		int totCnt = st.countTokens();		
		for(int cnt=1; cnt<=totCnt; cnt++){
			data01 = st.nextToken();
			System.out.println(cnt+". "+data01);
		}

/*		StringBuffer, StringBuilder Ŭ����
		�ڹٿ��� ����Ǵ� String�� ���������� ���ڿ��� ������ �� ����.
		String data = "���";
		data+=",�ٳ���"; �޸� 2�� ����
		String ���ڿ��� loop���̳� +�� ���� �޸𸮿� ������ �߻��ϱ� ������
		ȿ�������� ���� ���ڿ��� ó���� �� ����Ѵ�.
		
		�����忡 ����ȭ ���� ���ο� ���� StringBufferȰ��
		StringBuilder ���� ������ ȯ�濡�� ���ǵ��� ����
		append("�߰����ڿ�");
		toString() : ���� �߰��� ���ڿ��� ó��
*/
		StringBuffer sbf = new StringBuffer();
		for(int cnt=0; cnt<10; cnt++){
			sbf.append("�����߰�");
		}
		System.out.println("���� ���ڿ�: "+sbf.toString());
	}

}

