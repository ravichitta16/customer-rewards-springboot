package com.customer.reward.model;

import java.util.List;

public class Customer {

	private String customerName;
	private List<Transaction> transactions;
	private int customerTotalRewards;
	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public int getCustomerTotalRewards() {
		return customerTotalRewards;
	}

	public void setCustomerTotalRewards(int customerTotalRewards) {
		this.customerTotalRewards = customerTotalRewards;
	}
	

}
