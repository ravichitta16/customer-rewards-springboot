package com.customer.reward.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.reward.exception.CustomerRewardException;
import com.customer.reward.exception.ErrorResponse;
import com.customer.reward.model.TransacationPeriod;
import com.customer.reward.service.CustomerRewardsService;

@RestController
@RequestMapping("/customer")
public class CustomerRewardsController {
	
	@Autowired
	private CustomerRewardsService customerRewardsService;
	
	@RequestMapping(method=RequestMethod.GET, value="/rewards")
	@ExceptionHandler(CustomerRewardException.class)
	public ResponseEntity<?> getMonthlyTransactionRewards() {
		
		List<TransacationPeriod> transacationPeriods = customerRewardsService.getCalculateMonthlyRewards();
		
		if(CollectionUtils.isEmpty(transacationPeriods)) {
			  ErrorResponse errorResponse = new ErrorResponse();
	          errorResponse.setMessage("Record not found");
	          return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(transacationPeriods, HttpStatus.OK); 
		
	}

}
