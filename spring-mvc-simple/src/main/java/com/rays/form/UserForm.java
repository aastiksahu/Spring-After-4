package com.rays.form;

import org.hibernate.validator.constraints.NotEmpty;

public class UserForm {
	
	protected long id = 0;
	
	private long[] ids;
	
	@NotEmpty(message = "First Name is Required")
	private String firstName;

	@NotEmpty(message = "Last Name is Required")
	private String lastName;

	@NotEmpty(message = "Login is Required")
	private String login;

	@NotEmpty(message = "Password is Required")
	private String password;

	@NotEmpty(message = "Date of Birth is Required")
	private String dob;

	@NotEmpty(message = "Address is Required")
	private String address;
	
	private int pageNo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long[] getIds() {
		return ids;
	}

	public void setIds(long[] ids) {
		this.ids = ids;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

}
