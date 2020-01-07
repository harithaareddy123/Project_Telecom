package org.deloitte.telecom.entities;

public class MobileUser {

    private String mobileno;

    private String name;

  

    private String password;
    private double balance;

    

    public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public MobileUser(){

    }

    public MobileUser(String mobileno, String password,String name,double balance){
        this.mobileno=mobileno;
        this.name=name;
        this.password=password;
        this.balance=balance;
    }
}
