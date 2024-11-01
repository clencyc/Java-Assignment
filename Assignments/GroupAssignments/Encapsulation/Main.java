package Encapsulation;

public class Main {

    public static void main(String[] args) {
		Payroll band1=new Payroll();
		Payroll band2=new Payroll();

		band1.setRank("minimum_wage");
		band1.setSalary(15000.0);
	
		band2.setRank("junior_employees");
		band2.setSalary(50000);

		System.out.println("Salary band is:"+band1.getRank());
		System.out.println("Basic salary:"+band1.getSalary());
		System.out.println("Salary band is:"+band2.getRank());
		System.out.println("Basic salary:"+band2.getSalary());	
	}
    
}
