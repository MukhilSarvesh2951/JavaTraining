package dao;

public class Employee {
	private int EmployeeNumber;
	private String EmployeeName;
	private String EmployeeJob;
	private int EmployeeSalary;
	
	
	
	public Employee(int employeeNumber, String employeeName, String employeeJob, int employeeSalary) {
		super();
		this.EmployeeNumber = employeeNumber;
		this.EmployeeName = employeeName;
		this.EmployeeJob = employeeJob;
		this.EmployeeSalary = employeeSalary;
	}
	

	public Employee() {
		super();
	}


	public int getEmployeeNumber() {
		return EmployeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		EmployeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeJob() {
		return EmployeeJob;
	}

	public void setEmployeeJob(String employeeJob) {
		EmployeeJob = employeeJob;
	}

	public int getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	
	
	 
	

}
