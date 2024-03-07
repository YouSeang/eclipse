/*
 * this : 자기 자신을 접근하는 객체 레퍼선스변수,
 * 		인스턴스 메소드의 첫번째 매개변수로 항상 존재,
 * 		선얼할 수 없고 사용만 가능
 * 		객체 구별해주눈 역할 -> 디폴트 기능
 *
 * 		1. 필드명과 지역변수이름이 같을 경우 필드를 구별하기 위해 사용
 *		2. 인스턴스메소드에서 자기 자신의 객체를 리턴하고 싶을 때 사용
 * 
 *  - instance method의 첫번째 매개변수로 항상 존재
 *  - 자기 자신을 접근하는 reference variable
 *  
 *  
 * this() <-> this 호출(자기 자신을 호출하겠다=생성자역할을함)과 this와 다르다
 *  - 자기자신의 또 다른 생성자를 호출함  
 *  
 *  
 */

public class This1 {
	
	int a;

	public int getA() {
		return a; // this가 생략된 상황!! 원래는 this.a로 써야하는게 맞다..
	}

	public void setA(int a) {
		this.a = a; // this를 꼭 써야하는상황!! this가 붙으면 지역변수 'a'가 아니라 field 'a'; 지역변수와 field명이 같을 때 명시적으로 구분하기 위해
	}
	
	public This1 getObject() {
		return this; // 내 자신을 보내고자 할 때
	}

	public static void main(String[] args) {
		This1 th = new This1();
		
		th.setA(100); //100 앞에 th.100 'th.'이 생략되어 있음.
		
		This1 th2 = th.getObject(); //th와 th2는 같은 값을 지녔다.
		
		System.out.println(th);
		System.out.println(th2);
	}

}
