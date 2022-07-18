package com.adassignment;

public class Emp_Report {
	private String emp_Id;
	private String  emp_Name;
	private String emp_email;
	private String emp_job_Id;
	private String  emp_dept_id;
	private String emp_mgr_Id;
	
	
	public String getEmployee_Id() {
		return emp_Id;
	}
	public void setEmployee_Id(String employee_Id) {
		this.emp_Id = employee_Id;
	}
	public String getEmployee_Name() {
		return emp_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.emp_Name = employee_Name;
	}
	public String getEmail() {
		return emp_email;
	}
	public void setEmail(String email) {
		this.emp_email = email;
	}
	public String getJob_description() {
		return emp_job_Id;
	}
	public void setJob_description(String job_description) {
		this.emp_job_Id = job_description;
	}
	public String getDepartment_Name() {
		return emp_dept_id;
	}
	public void setDepartment_Name(String department_Name) {
		this.emp_dept_id = department_Name;
	}
	public String getManager_Name() {
		return emp_mgr_Id;
	}
	public void setManager_Name(String manager_Name) {
		this.emp_mgr_Id = manager_Name;
	}
}