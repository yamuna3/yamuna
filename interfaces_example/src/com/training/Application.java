package com.training;
import com.training.ifaces.Conditional;
import com.training.ifaces.Function;
import com.training.model.Professor;
import com.training.model.Student;

public class Application {
	public static void printResult(Conditional conditional) {
	  System.out.println(conditional.test());
	}
	public static void printvalues(Function[] objects) {
		for(Function eachFunction:objects) {
		System.out.println(eachFunction.apply(50));
	}
	}
   public static void main(String[] args) {
	   
		Function usdToInr = new CurrencyConvertor();
		
		Function celTofar = new TempConvertor();
		
		Function[] functions = {usdToInr,celTofar};
		
		printvalues(functions);
		
		
     Student ram= new Student(100,60);
     printResult(ram);
     
	Professor kanna = new Professor(202,"mca");
	printResult(kanna);

}
}