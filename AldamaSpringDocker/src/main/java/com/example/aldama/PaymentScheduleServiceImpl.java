package com.example.aldama;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentScheduleServiceImpl implements PaymentScheduleService{
	
	@Autowired
	private PaymentScheduleRepository paymentScheduleRepository;

	@Override
	public int created(ArrayList<PaymentSchedule> listPaymentSchedule) {
		// TODO Auto-generated method stub
		return paymentScheduleRepository.created(listPaymentSchedule);
	}
}