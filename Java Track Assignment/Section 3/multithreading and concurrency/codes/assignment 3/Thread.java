package employee_thread;
import java.util.*;
import java.util.concurrent.RecursiveAction;
public class Thread extends RecursiveAction{
	private List<Employee> employes;
	private int first;
	private int last;
	private double increment;
	
	public Thread(List<Employe> Employes,int first,int last,double increment)
	{
		this.employes = Employes;
		this.first = first;
		this.last = last;
		this.increment = increment;
	}
	protected void compute() {
		if(last-first<10) {
			updatesalary();
		}
		else {
			int middle = (first+last)/2;
			System.out.println("task pending tasks: %s\n",getQueuedTaskCount());
			Thread t1 = new Thread(employes,first,middle+1,increment);
			Thread t2 = new Thread(employes,middle+1,last,increment);
			invokeAll(t1,t2);
		}
	}
	private void updatesalary() {
		for(int i=first;i<last;i++) {
			Employe employe = employes.get(i);
			employes.setsalary((employe.getsalary())*2);
		}
	}
}
