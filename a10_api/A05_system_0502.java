package a10_api;

public class A05_system_0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� ���°��� 5�� ��� �����ϰ� �� �ܿ��� Security ���ܹ߻�
		System.setSecurityManager(new SecurityManager(){

			@Override
			public void checkExit(int status) {
				// TODO Auto-generated method stub
				super.checkExit(status);
				if(status!=5){
					throw new SecurityException();
				}
			}
			
		});
		for(int cnt=0; cnt<=10; cnt++){
//			count�� ���
			System.out.println("ī��Ʈ: "+cnt);
//			jvm ���� ��û
			try{
				System.exit(cnt);
			}catch(SecurityException e){
				System.out.println(e.getMessage());
			}
		}
	}

}
