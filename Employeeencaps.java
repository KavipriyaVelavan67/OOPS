class Employee{
	
	private String employee_id;
	private String employee_name;
	private int employee_salary;
	
	public void setemployeeid(String employee_id){
		
		this.employee_id = employee_id;
	}
	public String getemployeeid(){
		
		return employee_id;
	}
	
	public void setemployeename(String employee_name){
		
		this.employee_name= employee_name;
	}
	public String getemployeename(){
		
		return employee_name;
	}
	
	public void setemployeesalary(int employee_salary){
		
		this.employee_salary = employee_salary;
	}
	
	public int getemployeesalary(){
		
		return employee_salary;
	}
	
}
public class Employeeencaps{
    public static void main(String[]args){
		
		Employee e = new Employee();
		
		e.setemployeeid("374");
		e.setemployeename("Aakash");
		e.setemployeesalary(29000);
		
		//stem.out.println(e.getemployeeid());
		//stem.out.println(e.getemployeesalary());
		
		System.out.println("salary is "+e.getemployeesalary());
		
	}
}