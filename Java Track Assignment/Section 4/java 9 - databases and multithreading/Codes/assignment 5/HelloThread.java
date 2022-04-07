package com.question5.first;

public class HelloThread {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.start();
		B b = new B();
		b.start();
		C c = new C();
		c.start();
		D d = new D();
		d.start();
		E e = new E();
		e.start();
		F f = new F();
		f.start();
		G g = new G();
		g.start();
		H h = new H();
		h.start();
		I i = new I();
		i.start();
		J j = new J();
		j.start();
		
	}

}
class A extends Thread 
{
	public void run()
	{
	System.out.println("Hello-Thread: "+Thread.currentThread().getName());
	
	}
	
}
class B extends Thread
{
	public void run()
	{
		System.out.println("Hello-Thread: "+Thread.currentThread().getName());	
		
	}
}
class C extends Thread
{
	public void run()
	{
		System.out.println("Hello-Thread: "+Thread.currentThread().getName());
	}
	
}
class D extends Thread
{
	public void run()
	{
		System.out.println("Hello-Thread: "+Thread.currentThread().getName());
	}
}
class E extends Thread
{
	public void run()
	{
		System.out.println("Hello-Thread: "+Thread.currentThread().getName());
	}
}
class F extends Thread
{
	public void run()
	{
		System.out.println("Hello-Thread: "+Thread.currentThread().getName());
	}
}
class G extends Thread
{
	public void run()
	{
		System.out.println("Hello-Thread: "+Thread.currentThread().getName());
	}
}
class H extends Thread
{
	public void run()
	{
		System.out.println("Hello-Thread: "+Thread.currentThread().getName());
	}
}
class I extends Thread
{
	public void run()
	{
		System.out.println("Hello-Thread: "+Thread.currentThread().getName());
	}
}
class J extends Thread
{
	public void run()
	{
		System.out.println("Hello-Thread: "+Thread.currentThread().getName());
	}
}

