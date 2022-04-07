package employee_thread;

public class Employe {

	private int empid;
	private double empsalary;
	private String empname;
	public String getname() {
		return empname;
	}
	public void setname(String name) {
		this.empname = name;
	}
	public double getsalary() {
		return empsalary;
	}
	public void setsalary(double salary) {
		this.empsalary = salary;
	}
	public int getid() {
		return empid;
	}
	public void setid(int empid) {
		this.empid = empid;
	}

}
