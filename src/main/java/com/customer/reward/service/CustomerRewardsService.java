package com.customer.reward.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.reward.builder.CustomerResponseBuilder;
import com.customer.reward.model.TransacationPeriod;

@Service
public class CustomerRewardsService {
	
	@Autowired
	private CustomerResponseBuilder customerResponseBuilder; 
	
	public List<TransacationPeriod> getCalculateMonthlyRewards() {
		
		
		return customerResponseBuilder.buildCustomerRespone();
	}

}
