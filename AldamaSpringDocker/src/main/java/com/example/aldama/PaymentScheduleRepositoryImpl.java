package com.example.aldama;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentScheduleRepositoryImpl implements PaymentScheduleRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int created(ArrayList<PaymentSchedule> listPaymentSchedule) {
		for (PaymentSchedule paymentSchedule : listPaymentSchedule)
		{
			jdbcTemplate.update("INSERT INTO PaymentSchedule VALUES (?, ?, ?,?)" ,paymentSchedule.getCreditApplication(),
																					paymentSchedule.getPaymentNumber(),
																					paymentSchedule.getPaymentAmount(),
																					paymentSchedule.getPaymentDate() );
		}
		return 0;
	}

}
