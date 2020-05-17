public class Car2 {//#생성자의 오버로딩#
	//필드
	String company ="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car2(){
	}
	//생성자2
	Car2(String model){
		this.model = model;
		
	}
	//생성자3
	Car2(String model,String color){
		this.model = model;
		this.color = color;
	}
	//생성자4
	Car2(String model,String color,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	

}
