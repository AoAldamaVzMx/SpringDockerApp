package com.example.aldama;

import java.time.LocalDateTime;


public class PaymentSchedule {
	
	Double  creditApplication;
	Integer paymentNumber;
	Double  paymentAmount;
	LocalDateTime    paymentDate;
	
	public PaymentSchedule(Double  creditApplication, Integer paymentNumber, Double paymentAmount, LocalDateTime paymentDate) {
		super();
		this.creditApplication = creditApplication;
		this.paymentNumber = paymentNumber;
		this.paymentAmount = paymentAmount;
		this.paymentDate = paymentDate;
	}
	
	public Integer getPaymentNumber() {
		return paymentNumber;
	}
	public void setPaymentNumber(Integer paymentNumber) {
		this.paymentNumber = paymentNumber;
	}
	public Double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}
		

	public Double getCreditApplication() {
		return creditApplication;
	}

	public void setCreditApplication(Double creditApplication) {
		this.creditApplication = creditApplication;
	}

	@Override
	public String toString() {
		return "PaymentSchedule [creditApplication=" + creditApplication + ", paymentNumber=" + paymentNumber
				+ ", paymentAmount=" + paymentAmount + ", paymentDate=" + paymentDate + "]";
	}
		

	
}
