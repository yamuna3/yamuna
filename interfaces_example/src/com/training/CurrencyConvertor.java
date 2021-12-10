package com.training;

import com.training.ifaces.Function;

public class CurrencyConvertor implements Function {

	@Override
	public double apply(double arg) {
		return arg *60;
	
	}

}