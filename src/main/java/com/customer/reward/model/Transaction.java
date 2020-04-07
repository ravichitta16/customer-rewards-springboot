package com.customer.reward.model;

public class Transaction {
	
	private int dollersSpent;
	
	public Transaction(int dollersSpent) {
		this.dollersSpent = dollersSpent;
	}

	public int getDollersSpent() {
		return dollersSpent;
	}

	public void setDollersSpent(int dollersSpent) {
		this.dollersSpent = dollersSpent;
	}

}
