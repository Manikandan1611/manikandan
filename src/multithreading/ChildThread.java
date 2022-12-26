package multithreading;

public class ChildThread extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(3000);
				System.out.println("Child Thread " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Attempt 1
//			try {
//				//Thread.sleep(3000);
//				System.out.println("Inside run() method " + this.getState());
//
//				System.out.println("Child Thread " + i);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

		}

	}

}
