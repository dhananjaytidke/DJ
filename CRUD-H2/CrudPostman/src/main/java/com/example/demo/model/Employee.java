package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Emp_Tbl")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	@Size(min = 2, max = 7)
	@NotNull
	@NotEmpty
	private String empname;

	public Employee() {
		super();
	}

	public Employee(int empid, @Size(min = 2, max = 7) @NotNull @NotEmpty String empname, String empdept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
	}

	private String empdept;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpdept() {
		return empdept;
	}

	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

}
