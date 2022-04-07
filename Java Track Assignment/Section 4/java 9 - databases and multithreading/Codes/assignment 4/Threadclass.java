package com.question4;
import java.util.*;
class Threadclass extends Thread{
	private String name;
	public synchronized void run() {
		System.out.println("executing run method from Thread (Thread Name): "+Thread.currentThread().getName());
		System.out.println("executing run method from Thread (Thread Id): "+Thread.currentThread().getId());
		System.out.println("executing run method from Thread (Thread Priority): "+Thread.currentThread().getPriority());
		System.out.println("Phase of Thread in Thread class: "+Thread.currentThread().getState());
	}
}
class Runnableinterface implements Runnable{
	public synchronized void run() {
		System.out.println("executing run method from Runnable: "+Thread.currentThread().getName());
		System.out.println("executing run method from Runnable: "+Thread.currentThread().getId());
		System.out.println("executing run method from Runnable: "+Thread.currentThread().getPriority());
		System.out.println("Phase of Thread in Runnable class: "+Thread.currentThread().getState());
	}
}
