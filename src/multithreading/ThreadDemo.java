package multithreading;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChildThread ct = new ChildThread();
		System.out.println("After Object creation --> " + ct.getState());
		System.out.println("Thread ID --> " + ct.getId());
		System.out.println("Thread Name --> " + ct.getName());
		System.out.println("Thread Priority --> " + ct.getPriority());
		ct.setName("Devakumar");
		ct.setPriority(10);
		System.out.println(ChildThread.MAX_PRIORITY);
		System.out.println(ChildThread.MIN_PRIORITY);

		System.out.println("Thread Name --> " + ct.getName());

		ct.start(); // NEW to RUNNABLE
		// ct.start();
		System.out.println("After Starting I " + ct.getState());

		ChildThread ct2 = new ChildThread();
		ct2.start();
		ct2.join();
		ChildThread ct3 = new ChildThread();
		ct3.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread Demo " + i);
		}
		System.out.println("After Starting II " + ct.getState());

	}

}