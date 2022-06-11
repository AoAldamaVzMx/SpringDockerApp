package com.example.aldama;

public class Arguments {
	Integer terms;
	Double amount;
	Double  rate;
	public Integer getTerms() {
		return terms;
	}
	public void setTerms(Integer terms) {
		this.terms = terms;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "Arguments [terms=" + terms + ", amount=" + amount + ", rate=" + rate + "]";
	}
	
	


}
