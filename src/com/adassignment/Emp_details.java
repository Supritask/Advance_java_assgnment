package com.adassignment;
import java.sql.Date;

public class Emp_details {
	
	private String emp_Id;
	private String emp_Name;
	private String emp_email;
	private String emial_phone_number;
	private String emp_hire_Date;
	private String emp_job_Id;
	private String emp_salary;
	private String emp_commission_Pct;
	private String emp_mgr_Id;
	private String emp_dept_id;
	private Date record_insDate;
	
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
		this.emp_Name = email;
	}
	public String getPhone_number() {
		return emial_phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.emp_Name = phone_number;
	}
	public String getHire_Date() {
		return emp_hire_Date;
	}
	public void setHire_Date(String hire_Date) {
		this.emp_Name = hire_Date;
	}
	public String getJob_Id() {
		return emp_job_Id;
	}
	public void setJob_Id(String job_Id) {
		this.emp_Name = job_Id;
	}
	public String getSalary() {
		return emp_salary;
	}
	public void setSalary(String salary) {
		this.emp_Name = salary;
	}
	public String getCommission_Pct() {
		return emp_commission_Pct;
	}
	public void setCommission_Pct(String commission_Pct) {
		this.emp_Name = commission_Pct;
	}
	public String getManager_Id() {
		return emp_mgr_Id;
	}
	public void setManager_Id(String manager_Id) {
		this.emp_Name = manager_Id;
	}
	public String getDepartment_Id() {
		return emp_dept_id;
	}
	public void setDepartment_Id(String department_Id) {
		this.emp_dept_id = department_Id;
	}
	public Date getRecord_insDate() {
		return record_insDate;
	}
	public void setRecord_insDate(Date record_insDate) {
		this.record_insDate = record_insDate;
	}
}
