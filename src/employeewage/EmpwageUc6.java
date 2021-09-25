package employeewage;

public class EmpwageUc6 {
	public static void main(String[] args) {
		int totalSalary;
		int empRatePerHr = 20;
		int no_of_WorkingDays = 20;
		int totalWorkingDays = 0;
		int max_Hr_In_Month = 100;
		int empHr = 0;
		int totalEmpHrs = 0;
		while(totalEmpHrs < max_Hr_In_Month && totalWorkingDays < no_of_WorkingDays)
		{
			totalWorkingDays++;
			double empCheck = Math.floor(Math.random() * 10) % 3;
			int i = (int)empCheck;
			switch(i) {
			case 1:
				empHr = 8;
				break;
			case 2:
				empHr = 4;
				break;
			case 3:
				empHr = 0;
				break;	
			}
		totalEmpHrs = totalEmpHrs + empHr ;
			
		}
		    totalSalary = empRatePerHr * totalEmpHrs;
		    System.out.println("Total Salary is : " +totalSalary);
	}

}
