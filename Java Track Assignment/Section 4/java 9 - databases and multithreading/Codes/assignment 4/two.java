package com.question4.second;

class two extends Thread{
	int i;
	public void run() {
		for(i = 201;i<=300;i++) {
			System.out.println("two : "+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
