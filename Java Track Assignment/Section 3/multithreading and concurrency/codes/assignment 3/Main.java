package employee_thread;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

import employee_thread.Employe;
import employee_thread.Employegen;
import employee_thread.Thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employegen gen= new Employegen();
			List<Employe> employes= gen.generate(10);
			Thread thread=new Thread(employes,0,employes.size(),0.20);
			for(int i=0;i<employes.size();i++) {
				Employe employ=employes.get(i);
				System.out.printf("Employe %s: %f \n",employ.getname(),employ.getsalary());
			}
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println("To Increase the salary of Employes");
			System.out.println("------------------------------------------------------------------------------------------");
			ForkJoinPool pool=new ForkJoinPool();
			pool.execute(thread);
			do {
				System.out.printf("**************************************\n");
				System.out.printf("Main: Pralleism:%d\n", pool.getCommonPoolParallelism());
			}while(!thread.isDone());
			pool.shutdown();
			
			if(thread.isCompletedNormally()) {
				System.out.println("Main: The process has completed normally. \n");
			}
			for(int i=0;i<employes.size();i++) {
				Employe employ=employes.get(i);
				System.out.printf("Employe %s: %f \n",employ.getname(),employ.getsalary());
			}

	}

}
