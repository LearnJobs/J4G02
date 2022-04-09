package com.ex.em.emp;

public class Employee {
	private long empId;
	private String empName;
	private String empDepartment;
	
	public Emp() 
	{
		
	}
	
	
	@Override
	public String toString()
	 {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empDepartment="+ empDepartment + "]";
	}
	public Emp(long empId, String empName, String empDepartment) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
	}
	public long getEmpId() 
	{
		return empId;
	}
	public void setEmpId(long empId) 
	{
		this.empId = employeeId;
	}
	public String getEmpName() 
	{
		return empName;
	}
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	public String getEmpDepartment() 
	{
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment)
	 {
		this.empDepartment = empDepartment;
	}

}