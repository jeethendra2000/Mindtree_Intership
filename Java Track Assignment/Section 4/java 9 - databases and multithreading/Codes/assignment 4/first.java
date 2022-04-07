package com.question4.second;

class first extends Thread{
	int i;
	public void run() {
		for(i=101;i<=200;i++) {
			System.out.println("first : "+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
