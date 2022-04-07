package com.question4.second;

public class Three_thread_running_simultaneously {
	public static void main(String arg[]) throws InterruptedException
	{
		first f=new first();
		f.start();
		
		Thread.sleep(10);
		two t=new two();
		t.start();
		Thread.sleep(10);
		
		three t1=new three();
		t1.start();
		
		
		
	}

}
