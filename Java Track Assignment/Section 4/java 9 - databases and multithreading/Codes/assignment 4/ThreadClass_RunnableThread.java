package com.question4;

public class ThreadClass_RunnableThread{
	public static void main(String[] args) {
		int id;
		System.out.println("main name: "+Thread.currentThread().getName());
		System.out.println("main id: "+Thread.currentThread().getId());
		System.out.println("main priority: "+Thread.currentThread().getPriority());
		Threadclass t = new Threadclass();
		t.start();
		System.out.println("main method name: "+Thread.currentThread().getName());
		System.out.println("main method id: "+Thread.currentThread().getId());
		System.out.println("main method priority: "+Thread.currentThread().getPriority());
		Runnable r = new Runnableinterface();
		Thread t1 = new Thread(r);
		t1.start();
	}
}
