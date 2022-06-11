package com.example.aldama;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculateListPayments {
	
	@Autowired
	private PaymentScheduleService paymentScheduleService;
	
	
	private static final String CLPayment = "/calculate";
	private static Double myApplication = 0.00 ; 
	
	@RequestMapping(value = CalculateListPayments.CLPayment, method = RequestMethod.POST)
	public ArrayList<PaymentSchedule> Calculate(@RequestBody  Arguments newArguments) {
		
	
		if ((newArguments.getAmount() < 1.0 ) ||(newArguments.getAmount() > 999999.00 ) )
		{			
			throw new InvalidRequest("The amount should be more than $1.00, the max should be lesser than $999,999.00");
		}
		
		if ((newArguments.getRate() < 1.0 ) ||(newArguments.getRate() > 100.00 ) )
		{			
			throw new InvalidRequest("The rate should bigger than 1%, lesser than 100%.");
		}
		
		if ((newArguments.getTerms() < 4.0 ) ||(newArguments.getTerms() > 52 ) )
		{			
			throw new InvalidRequest("The max terms (weeks) were the payment can be paid is 52, the minimum should be 4");
		}
		
		Double Step1 = Math.pow((1 + ((newArguments.getRate()/100)/12)),- newArguments.getTerms());
		Double Step2 = ((newArguments.getRate()/100)/12)/(1- Step1);
		Double Payment = Step2 * newArguments.getAmount();
		
		ArrayList<PaymentSchedule>  payMentSchedule =  new ArrayList<PaymentSchedule>();
		
		LocalDateTime myDate = LocalDateTime.now() ;
		myApplication++;
		for (Integer index = 1 ; index <= newArguments.getTerms() ; index++)
		{			
			payMentSchedule.add(new PaymentSchedule(myApplication, index,Payment, myDate ) );
			myDate = myDate.plusDays(7);
			
		
		}

		paymentScheduleService.created(payMentSchedule);
				
		return payMentSchedule;
		
	}	
}
