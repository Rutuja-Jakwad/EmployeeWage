package employeewage;

public class EmpwageUc4 {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		
		int empRatePerHr = 20;
		int empHrs =0;
		int empWage =0;
		
		double empCheck = Math.floor(Math.random() *10 %3);
		int c = (int)empCheck;
		switch(c)	{  
		case 1 :
		 //empCheck == IS_FULL_TIME;
				empHrs = 8;
				empWage = empHrs * empRatePerHr;
		break;
		case 2:
		 //empCheck == IS_PART_TIME;
				empHrs = 4;
		 empWage = empHrs * empRatePerHr;
		 break;
		 default:
			empHrs = 0;
		}
		System.out.println(empWage);
		}
	
	}

}
