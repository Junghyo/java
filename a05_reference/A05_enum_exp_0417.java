/*
 enum�� Ȱ���� ����.
 ���� ��¥ ���� ��ü: Calendar
 Calendar cal = Calendar.getInstance();
 Calendar.YEAR(����), Calendar.MONTH(��0~11), Calendar.DAY_OF_MONTH(��), Calendar.DAY_OF_WEEK(����1~7)
 
 ca.get(Calendar.DAY_OF_WEEK): ��������
 1~7 Week.SUNDAY~SATURDAY
 switch case���� ���ؼ� ���� ��¥ ���� ���
 ���� ���� ���õ� ������ �Ͽ����̸� ����� ���� ������ ó��
*/		


package a05_reference;

import java.util.Calendar;

public class A05_enum_exp_0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ���� ���� ���� enum ���� */
		
		Week today=null;
		// ���� ���� ���� Week enum
		Calendar cal = Calendar.getInstance();
		/* ���� ��¥�� ���� ���� index�� ��������
		Calendar.getInstance(); */
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// Calendar.DAY_OF_WEEK : ���� ���Ͽ� ���õ� ����(1~7 ��~��)
		
		System.out.println("��ü���� ���� : "+Calendar.DAY_OF_WEEK);
		System.out.println("���� ���� index�� : "+week);
		
		switch(week){
			case 1: today=Week.SUNDAY; break;
			case 2: today=Week.MONDAY; break;
			case 3: today=Week.TUESDAY; break;
			case 4: today=Week.WEDNESDAY; break;
			case 5: today=Week.THURSDAY; break;
			case 6: today=Week.FRIDAY; break;
			case 7: today=Week.SATURDAY; break;
		}
		System.out.println("������ ������? "+today);
		if(week==1){
			System.out.println("�������� �ܴ�.");
		}else{
			System.out.println("���ó�� �����Ѵ�.");
		}
		if(today==Week.SUNDAY){
			System.out.println("�������� �ܴ�.");
		}else{
			System.out.println("���ó�� �����Ѵ�.");
		}
	}

}
