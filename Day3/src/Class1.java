/*
 * 구성요소
 * 1. field :
 *  - 객체가 생성된 후 지속적으로 사용되어지는 변수
 *  - 접근지정자 주로 private(외부에서 데이터에 접근할 수 없게 하기위해).
 *  - static(공유하고자할때 사용;하나씩 메모리가 생기는것보다 전체의 메모리 생성-효율성측면?<->클래스마다 쓸거야-instance), final (읽기전용:값을 바꿀 수 없음)
 *  - instance field, static field
 * 
 * 2. constructor(생성자함수)
 *  - 객체 생성시 자동호출되어지는 함수 (딱 1번만 불러짐;이때 외에는 부를 수 없음)
 *  - 생성자함수를 명시적으로 제공하지 않을경우 디폴트생성자를 제공
 *  - 리턴타입이 존재하지않고, 함수명은 클래스명과 동일
 *  - 기능
 *  	1) 디폴트기능 : 객체등록
 *  	2) 사용자기능 : 객체생성시 필드초기화
 *  - 오버로딩이 가능
 *  - 접근지정자를 주로 public으로 지정
 *  - 디폴트생성자를 명시적으로 만들경우 숨어있는 디폴트는 제공하지 않는다.
 *  - 명시적으로 생성자를 하나이상 만들경우 디폴트는 제공하지 않는다.
 * 
 * 3. method
 *  - instance method를 static method보다 더 많이 사용
 *  - 외부에서(class밖에서) 내부의 필드를 접근해서 사용할 수 있게 하기위해
 *  - 접근지정자를 주로 public으로 지정(외부에서 접근하게 하기 위해)
 *  - instance method, static method
 *   => 문법적 큰 차이 : this 여부 (instance에 있음)
 *  - 오버로딩이 가능하다. (편의성)
 *  
 *  오버로딩 -> 다형성(시험문제 꼭 나옴)
 *  - 동일한 함수명으로 여러개의 함수를 만들어서 제공
 *  - 같은 기능을 수행(중요)하는 것을 하나의 이름으로 묶어서 제공함으로써 사용자가 편하게 쓸 수 있게 해주는 기능
 *  - 함수명을 동일하게 하면서 (매개변수,인자,agument)를 구분을 할 수 있어야 한다.
 *   1. 매개변수 개수가 다를경우
 *   2. 매개변수 타입이 다를경우
 */


public class Class1 {

	private int a;
	private char s;
	private float c;
	
	public static void main(String[] args) {
		Class1 ce = new Class1(); //이때 생성자함수 constructor 호출되어짐
		ce.ouput(1,2); // instance method라서 객체를 만들어야함
		ce.ouput(3.4);
		ce.ouput(11);
		ce.ouput();

	}

	public void ouput(int a,int b) {
		System.out.println("a,b");
	}
	
	public void ouput(double a) {
		System.out.println("a");
	}
	
	public void ouput() {
		System.out.println("Nothing");
		
	}
}
