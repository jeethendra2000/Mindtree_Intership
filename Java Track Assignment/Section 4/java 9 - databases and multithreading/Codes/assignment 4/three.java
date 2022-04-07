package com.question4.second;

class three extends Thread{
	int i;
	public void run()
	{
		for(i=301;i<=400;i++)
		{
			System.out.println("three : "+i);
		try {
			Thread.sleep(500);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	}
}
