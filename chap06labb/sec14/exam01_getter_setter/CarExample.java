package sec14.exam01_getter_setter;

public interface CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed2 = -5;
		// myCar.speed=-5;
		myCar.setSpeed(-5);

		System.out.println("현재 속도:" + myCar.getSpeed());
//		System.out.println("speed2:" + myCar.Speed2);
	}
}
