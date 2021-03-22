package com.yjs3408;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

	@EmbeddedId
	private LoginName loginName;

	@Column(name = "salary")
	private Float salary;

	@Temporal(TemporalType.DATE)
	@Column(name = "hired_date")
	private Date hiredDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "birth_date")
	private Date birthDate;

	@Transient
	private int age;

	@Column(name = "description")
	@Lob
	private String description;

	@Embedded
	@AttributeOverrides(value = { @AttributeOverride(name = "city", column = @Column(name = "home_city")),
			@AttributeOverride(name = "zipCode", column = @Column(name = "home_zip_code")) })
	private Address homeAddress;

	@Embedded
	@AttributeOverrides(value = { @AttributeOverride(name = "city", column = @Column(name = "work_city")),
			@AttributeOverride(name = "zipCode", column = @Column(name = "work_zip_code")) })
	private Address workAddress;

	public LoginName getLoginName() {
		return loginName;
	}

	public void setLoginName(LoginName loginName) {
		this.loginName = loginName;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Date getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}


}
