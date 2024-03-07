import java.util.Scanner;

public class Class3Prac {

	//사칙연산계산기 만들기
	
	//field
	
	private int num1, num2;
	private String op;
			
	//constructor

	public Class3Prac(int a, String b, int c){
		num1 = a;
		op = b;
		num2 = c;
	}
		
	public int getA() {
		return num1;
	}
			
	public String getB() {
		return op;
	}
	
	public int getC() {
		return num2;
	}
	
	public int add() {
		System.out.print(getA()+"+"+getC()+"=");
		return getA()+getC();
	}
	
		//method
		
	public static void main(String[] args) {

		int num1, num2;
		String op;
		Scanner sc = new Scanner(System.in);
	
		
	do {
		int num1 = sc.nextInt();
		String op = sc.next();
		int num2 = sc.nextInt();
		
		Class3Prac ce = new Class3Prac(num1, op, num2)
				
		switch (ce.op) {
		case '+': System.out.println(ce.add());break;
		case '-': System.out.println(num1+""+op+""+num2+"="+ (num1-num2));break;
		case '*': System.out.println(num1+""+op+""+num2+"="+ (num1*num2));break;
		case '/': System.out.println(num1+""+op+""+num2+"="+ ((double)num1/num2));break;

		System.out.println("더 계산? y/Y");
		ans = sc.next().charAt(0);
		}
	

}while(ans=='y'||ans=='Y');

}
	
}
