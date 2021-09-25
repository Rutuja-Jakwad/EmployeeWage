package employeewage;

public class EmpwageUc4 {
	public static void main(String[] args) {
		int empRatePerHr = 20;
		int empWorkingHr = 0;
		double empCheck =Math.floor(Math.random()*10) % 3;
		int i = (int)empCheck;
		switch(1) {
		case 1: 
			empWorkingHr = 8;
			break;
		case 2:
			empWorkingHr = 4;
			break;
		case 3:
			empWorkingHr = 0;
			
		}
	int salary = empWorkingHr + empRatePerHr;
	System.out.println("Salary of the employee is:" + salary);
	
	
	}

}
