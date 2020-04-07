package com.customer.reward.model;

import java.util.List;

public class TransacationPeriod {

	private List<Customer> customers;
	private int totalMonthlyRewards;
	private String transactionsMonth;

	public int getTotalMonthlyRewards() {
		return totalMonthlyRewards;
	}

	public void setTotalMonthlyRewards(int totalMonthlyRewards) {
		this.totalMonthlyRewards = totalMonthlyRewards;
	}

	public String getTransactionsMonth() {
		return transactionsMonth;
	}

	public void setTransactionsMonth(String transactionsMonth) {
		this.transactionsMonth = transactionsMonth;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		result = prime * result + totalMonthlyRewards;
		result = prime * result + ((transactionsMonth == null) ? 0 : transactionsMonth.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransacationPeriod other = (TransacationPeriod) obj;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		if (totalMonthlyRewards != other.totalMonthlyRewards)
			return false;
		if (transactionsMonth == null) {
			if (other.transactionsMonth != null)
				return false;
		} else if (!transactionsMonth.equals(other.transactionsMonth))
			return false;
		return true;
	}

	
}
