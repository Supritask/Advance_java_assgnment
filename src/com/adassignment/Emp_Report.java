package com.adassignment;

public class Emp_Report {
	private String emp_Id;
	private String  emp_Name;
	private String email;
	private String job_description;
	private String  dept_Name;
	private String manager_Name;
	public String getEmployee_Id() {
		return emp_Id;
	}
	public void setEmployee_Id(String employee_Id) {
		this.emp_Id = employee_Id;
	}
	public String getEmployee_Name() {
		return emp_Id;
	}
	public void setEmployee_Name(String employee_Name) {
		this.emp_Name = employee_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJob_description() {
		return job_description;
	}
	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}
	public String getDepartment_Name() {
		return dept_Name;
	}
	public void setDepartment_Name(String department_Name) {
		this.emp_Id = department_Name;
	}
	public String getManager_Name() {
		return manager_Name;
	}
	public void setManager_Name(String manager_Name) {
		this.manager_Name = manager_Name;
	}
}