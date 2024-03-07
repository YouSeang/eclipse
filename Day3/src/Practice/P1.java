package Practice;

public class P1 {

	private int a;
	private int s;
	private int c;
	
	public static void main(String[] args) {
		
		P1 p = new P1(); 
		/* 1.연산자 new에 의해서 메모리(heap)에 P1클래스의 인스턴스가 생성된다.
		 * 2.생성된 P1()가 호출되어 수행된다.
		 * 3.연산자 new의 결과로, 생성된 P1인스턴스의 주소가 반환되어 참조변수 p에 저장된다.
		 * 
		 * 변수는 1.멤버변수(static, instance) 2.지역변수로 나뉨.
		 * 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
		 */
		p.ouput(1,2);
		p.ouput(3.4);
		p.ouput(11);
		p.ouput();

	}
	
	public void ouput(int a, int b) {
		System.out.println("a, b");
	}
	
	public void ouput(double a) {
		System.out.println("a");
	}
	
	public void ouput() {
		System.out.println("Nothing");
	}
	
	

}
