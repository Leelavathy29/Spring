package annotationBasedInjection;

import java.util.Date;

public class Employee {

	String employeeName;

	long employeeSalary;

	String employeeDestination;

	Date dateOfJoining;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeDestination() {
		return employeeDestination;
	}

	public void setEmployeeDestination(String employeeDestination) {
		this.employeeDestination = employeeDestination;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeSalary=" + employeeSalary
				+ ", employeeDestination=" + employeeDestination + ", dateOfJoining=" + dateOfJoining + "]";
	}

}
