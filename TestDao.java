package dao;

public class TestDao {


		


		public static void main(String[] args) {

			EmployeeDAOimpl empDaoImpl = new EmployeeDAOimpl();
		
			Employee employee = new Employee();
			employee.setEmployeeNumber(112);
			employee.setEmployeeName("Robert");
			employee.setEmployeeJob("Clerk");
			employee.setEmployeeSalary(6000);
			
			empDaoImpl.addEmployee(employee);
			
		

	}

}
