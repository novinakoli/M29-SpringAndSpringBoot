package org.stjohn.springioc;

//implementing a debit card interface
public class SBICard implements DebitCard {

	@Override
	public void deposit() {
		System.out.println("SBI depositing an amount of 1 lakh");

	}

	@Override
	public void withdraw() {
		System.out.println("SBI withdrawing an amount of 1 lakh");

	}

}
