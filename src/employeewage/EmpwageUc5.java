package employeewage;

public class EmpwageUc5 {
	public static void main(String[] args) {
		int totalSalary =0;
		int empRatePerHr = 20;
		int empWorkingDays = 20;
		int empHr = 0;
		int salary;
		int day;
		for(day = 0; day <= empWorkingDays; day++) {
			double empCheck =Math.floor(Math.random() * 10) % 3;
			int i = (int)empCheck;
			switch(1) {
			case 1: 
				empHr = 8;
				break;
			case 2:
				empHr = 4;
				break;
			case 3:
				empHr = 0;
		}
			salary = empRatePerHr * empHr;
			System.out.println("Salary for the day" + day + "is : " + salary);
			totalSalary = salary + totalSalary;
			System.out.println("Total salary is :" +totalSalary);
		}
	}
 }


