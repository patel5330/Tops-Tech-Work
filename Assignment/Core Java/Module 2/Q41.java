//W.A.J. P to create one thread by implementing Runnable interface in 
//Class.
class myThread implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "" + Thread.currentThread().getName());
		}
	}

}

public class Q41 {
	public static void main(String[] args) {
		myThread rinnble = new myThread();
		Thread t1 = new Thread(rinnble);
		t1.start();
	}

}
