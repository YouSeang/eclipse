
public class Class2 {

	//field
	private int a;
	
	//constructor
	public Class2() { //눈에 보이지 않았던 디폴트생성자
		System.out.println("디폴트생성자");
	}
	
	public Class2(int aa) { //눈에 보이지 않았던 디폴트생성자
		a = aa;
	}
	
	//method : (문법은 아니지만 문법처럼 쓰이는것) setter(외부에서 주는 데이터를 입력하는 함수), getter(외부에서 필드값을 얻어가는 함수)
	
	public void setA(int num) { //생성된 이후에 아무때나 값을 넣고 싶을떄
		a = num;
	}
	
	public int getA() {
		return a;
	}
	
	public static void main(String[] args) {

		Class2 cl2 = new Class2(); // 생성자호출
		Class2 cl3 = new Class2(10); // 생성자호출
		Class2 cl4 = new Class2(5600); // 생성자호출
		
		cl2.setA(500);  //cl2.a = 500; 이러면 외부에서 내부의 필드에 접근하게 되버림. 따라서 외부에서 접근할 수 있게끔 하기 위해 setter 사용
		System.out.println(cl2.getA()); //(cl2.a) getter 사용
		System.out.println(cl3.a);
		System.out.println(cl4.a);
	}

}
