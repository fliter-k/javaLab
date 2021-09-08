package sec10.exam04_sigleton;

public class SingtonExample {

	Singleton obj1 = Singleton.getInstance();
	Singleton obj2 = Singleton.getInstance();
	if(obj1 == obj2) {
		System.out.println("같은 Singleton 객체입니다");
	
	}
}
