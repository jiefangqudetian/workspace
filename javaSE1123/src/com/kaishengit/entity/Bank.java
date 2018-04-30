package com.kaishengit.entity;

public class Bank {
	
	private Bank(){}
	
	private static Bank bank = new Bank();
	
/*	public static Bank getInstance(){
		return bank;
	} 
*/	
	public static Bank getInstance(){
		if(bank == null) {
			bank = new Bank();
		}
		return bank;
	} 

}
