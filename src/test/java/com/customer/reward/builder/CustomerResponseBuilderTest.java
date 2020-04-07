package com.customer.reward.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.customer.reward.model.Customer;
import com.customer.reward.model.TransacationPeriod;
import com.customer.reward.model.Transaction;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class CustomerResponseBuilderTest {
	
	@Mock
	private Customer customer;
	
	@Mock
	private TransacationPeriod transacationPeriod;
	
	@Mock
	private Transaction transaction;
	
	@InjectMocks
	CustomerResponseBuilder customerResponseBuilder;
	
	List<TransacationPeriod> transacationPeriods;
	List<Transaction> transactions;
	
	@Before
	public void init() {
        MockitoAnnotations.initMocks(this);
        
        transacationPeriods = Arrays.asList(transacationPeriod);
        transactions = Arrays.asList(transaction);
    }
	
	@Test
	public void testBuildCustomerRespone()  throws Exception {
		
		List<TransacationPeriod> resultMonths = customerResponseBuilder.buildCustomerRespone();
		
		assertNotNull(resultMonths);
		assertEquals(resultMonths.size(), 3);
		
	}

}
