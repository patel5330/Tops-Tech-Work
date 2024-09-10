//W.A.J.P to start the same Thread twice by calling start () method twice. Test 
//ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();

class myThreadd extends Thread{
	public void run() {
		System.out.println("Thred start....");

	}
}
public class Q43 {
	public static void main(String[] args) {
		myThreadd d1=new myThreadd();
		d1.start();
		
		
		d1.start();
		
	}

}
