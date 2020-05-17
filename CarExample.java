public class CarExample {//#객체 생성 후 필드값 출력#
	public static void main (String[] args) {
		
		
		Car myCar = new Car();
		
		
		//객체생성
		System.out.println("제작회사:"+ myCar.company);
		System.out.println("모델명:"+ myCar.model);
		System.out.println("색깔:"+ myCar.color);
		System.out.println("최고속도:"+ myCar.maxSpeed);
		System.out.println("현재속도:"+ myCar.speed);
		
		//필드값 변경
		myCar.speed =60;
		System.out.println("수정된 속도:"+ myCar.speed);
		
		
		Car myCar2 = new Car("검정",3000);
		//Car myCar2 = new() x기본 생성자를 호출할 수 없다.
	}

}
