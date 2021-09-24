package employeewage;

public class EmpwageUc3 {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		
		int EmpRatePerHr = 20;
		int empHrs =0;
		int empWage =0;
		
		double empCheck = Math.floor(Math.random() *10 %3);
		if (empCheck == IS_FULL_TIME)
				empHrs = 8;
		if (empCheck == IS_PART_TIME)
				empHrs = 4;
		else
			empHrs = 0;
		empWage = empHrs * EmpRatePerHr;
		System.out.println("Emp Wage: " + empWage);
	}

}
