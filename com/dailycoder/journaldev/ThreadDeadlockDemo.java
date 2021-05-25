package com.dailycoder.journaldev;

public class ThreadDeadlockDemo {

	public static void main(String[] args) {
		
		final String resource1="RESOURCE_1";
		final String resource2="RESOURCE_2";
		
		new Thread() {
			public void run() {
				
				synchronized(resource1){
					
					System.out.println("Resource 1 aquired waiting for resource 2");
					synchronized (resource2) {
							try {
								Thread.sleep(5000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				}
			};
		}.start();
		
		
		new Thread() {
			public void run() {
				
				synchronized(resource2){
					
					System.out.println("Resource 2 aquired waiting for resource 1");
					synchronized (resource1) {
						
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			};
		}.start();
	}
}
