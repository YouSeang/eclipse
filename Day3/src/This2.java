//내 자신의 생성자를 생성자에서 호출하는 방법.

public class This2 {

	int a;
	int b;
	
	//생성자 만들어주기..
	public This2() {
		//this.a = 0 생략되어있음
		//this.b = 0 생략되어있음
		this(0,0);
	}
	public This2(int a) {
		this.a = a;
		//this.b = 0 생략되어있음
//		this(a,0); 으로 사용할 수도 있음
	}
	public This2(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {

		This2 th = new This2(); //0,0
		This2 th2 = new This2(10); //10,0
		This2 th3 = new This2(20,30); //20,30

		System.out.println(th.getA()+","+th.getB());
		System.out.println(th2.getA()+","+th2.getB());
		System.out.println(th3.getA()+","+th3.getB());
		

	}

}
