package com.training;
import com.training.ifaces.Function;

public class TempConvertor implements Function {

// c to f temperature
	public double apply(double arg) {

		return (arg * 9/5)+32;
	}

}
