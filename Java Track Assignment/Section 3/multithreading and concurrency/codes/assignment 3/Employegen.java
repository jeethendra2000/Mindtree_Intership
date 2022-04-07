package employee_thread;
import java.util.*;
public class Employegen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public List<Employe> generate(int size){
			List<Employe> emp = new ArrayList<Employe>();
			for(int i=0;i<size;i++) {
				Employe employee = new Employe();
				employee.setname("emp"+(i+1));
				employee.setid(i+1);
				employee.setsalary(1000.0);
				emp.add(employee);
			}
			return emp;
		}
	}

}
