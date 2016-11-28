package CPU;

public class Main {
	public static void main(String[] args) {
		Thread1 a=new Thread1();
		Thread a1=new Thread(a);
		a1.start();
		Thread a2=new Thread(a);
		a2.start();
		
		
	}

}
