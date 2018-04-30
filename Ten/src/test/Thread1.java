package test;

public class Thread1 extends Thread {

	public void run(){
		for(int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("thread  " + i);
		}
	}
}
