package org.stjohn.springioc;
//implementing a debit card interface
public class HDFCCard implements DebitCard {

	@Override
	public void deposit() {
		System.out.println(" HDFC depositing an amount of 1 lakh");

	}

	@Override
	public void withdraw() {
		System.out.println(" HDFC withdrawing an amount of 1 lakh");

	}

}
