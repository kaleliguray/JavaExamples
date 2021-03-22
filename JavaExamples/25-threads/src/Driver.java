import java.time.LocalDateTime;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		});

		thread1.start();
		thread2.start();
		
//		Singleton instance1 = Singleton.getInstance();
//		Singleton instance2 = Singleton.getInstance();
//		Singleton instance3 = Singleton.getInstance();
//		Singleton instance4 = Singleton.getInstance();
//		
//		System.out.println(instance1 == instance2);
		
		
//		Thread thread = Thread.currentThread();
//		System.out.println(thread.getId());
//		System.out.println(thread.getName());
//		System.out.println(thread.getState());
//
//		Scanner scanner = new Scanner(System.in);
////		while(true) {
////			String line = scanner.nextLine();
////			System.out.println(line.toUpperCase());
////		}

//		System.out.println(Thread.currentThread().getName());
//
//		new Thread() {
//			public void run() {
//				System.out.println(Thread.currentThread().getName());
//			};
//		}.start();
//
//		Thread thread0 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				while (true) {
//					System.out.println(Thread.currentThread().getName());
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		});
//		thread0.setName("Downloader Thread");
////		thread0.setDaemon(true);
//		thread0.start();
//
//		Thread thread1 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				while (true) {
//					System.out.println(Thread.currentThread().getName());
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		});
//		thread1.setName("Uploader Thread");
////		thread1.setDaemon(true);
//		thread1.start();
//
//		System.out.println("Main finished");
	}

}
