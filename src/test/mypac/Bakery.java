package test.mypac;

public class Bakery {
	// 멤버필드
	public String branch; // 지점명을 저장할 멤버필드
	
	// 생성자
	public Bakery(String branch){
		this.branch = branch;
	}
	
	
	// 클래스 안에 필드, 생성자, 메소드 외에 또 다른 클래스도 정의할수 있다.
	public class Bread{ // inner Class
		
		public void eat(){
			System.out.println(branch+"빵을 먹어요");
		}
	}
	// Bread type 객체를 리턴해주는 메소드
	public Bread getBread(){
		return new Bread();
	}
	// 콜라를 먹는 메소드
	public void eatCola(){
		// 메소드 안에 클래스를 정의 할 수도 있다.
		class Cola{ // local inner class
			public void eat(){
				System.out.println(branch+"콜라를 마셔요!");
			}
		}
		new Cola().eat();
	}
}
