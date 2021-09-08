package verify.exam17;

public class PrinterExample {
//정적메소드는 바로 이름붙여서 할수있음.!메소드열에있음 
	//인스턴스 메소드는 힙메모리에 있음.생성자 컨스트럭트를 적어야함
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}

}
