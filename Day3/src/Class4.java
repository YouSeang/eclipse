import java.util.Scanner;

public class Class4 {

	//변수선언 -> field; 항상 똑같은 값으로 설정하기 위해 생성자설정?(변수설정?)
	private int num1,num2;
	private	char ch;
	private double result;
	private	char ans;
	
	//constructor
	public Class4() { //디폴트생성자; 클래스가 있으면 생성자는 따라온다.
	}
	
	public Class4(int n1, char c, int n2) {
		num1 = n1; //this.num1 = n1; this가 생략되어있음
		ch = c;
		num2 = n2;
	}
	
	//method; 필드하나당 setter, getter 1개씩 설정(메소드 설정)
	public void setNum1(int n) { //instance -> static이 없기때문에
		num1 = n;
	}
	public void setNum2(int n) {
		num2 = n;
	}
	public void setCh(char c) {
		ch = c;
	}
	//외부에서 원하는 언제든 값을 주겠다. 그렇기 때문에 public을 사용
	public int getNum1() {
		return num1; 
	}
	public int getNum2() {
		return num2; 
	}
	public char getCh() {
		return ch; 
	}
	//3+4라는 데이터는 외부에서 받아와야하는거지 계산기가 직접 누르는건 아니다. 
	public double plus(int n1, int n2) {
		return result = n1+n2;
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Class4 calc = new Class4(); 값이 없기떄문에 아래쪽에 값을 설정해주고
		
		int num = sc.nextInt();
		//calc.setNum1(num);
		//calc.setNum1(sc.nextInt());
		char ch = sc.next().charAt(0);
		//calc.setCh(ch);
		int num2 = sc.nextInt();
		//calc.setNum2(num2);
		Class4 calc = new Class4(num,ch,num2); //값이 있기때문에 값 설정x
		
		System.out.print(calc.getNum1()+""+calc.getCh()+""+calc.getNum2()+"=");
		System.out.println(calc.plus(num, num2));

		
	}

}
