package Task;

class Employee{
	int id = 101;
	int sal = 15000;
	
	void calculateSalary() {
		System.out.println("Calculate Attendence");
	}
}


class Manager extends Employee{
	
	void approveSalary() {
		System.out.println("Approve");
	}
}

class Executive extends Manager{
	
	void salaryCredit() {
		System.out.println("Salary Credit");
	}
}



public class InheritanceTask {
	public static void main(String args[]) {
		
		Executive ceo = new Executive();
		System.out.println(ceo.id);
		
		ceo.calculateSalary();
		ceo.approveSalary();
		ceo.salaryCredit();
		
	
		
		System.out.println();
	
		Manager mgr = new Manager();
		mgr.calculateSalary();
		mgr.approveSalary();
		
		System.out.println(mgr.id);
		
		System.out.println();
		
		Employee emp =  new Employee();
		
		emp.calculateSalary();
		System.out.println(emp.id);
		
		
		
		
	}
}
