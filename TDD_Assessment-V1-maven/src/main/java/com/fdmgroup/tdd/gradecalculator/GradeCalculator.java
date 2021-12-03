package com.fdmgroup.tdd.gradecalculator;

public class GradeCalculator implements GradeCalculatorService {

	@Override
	public String getClassification(double mark) {
		// TODO Auto-generated method stub
		if(mark < 75.0) {
			return "fail";
		}
		
		else if(mark >= 75 && mark < 80) {
			return "pass";
		}
		
		else if(mark >= 80 && mark < 90) {
			return "merit";
		}
		return "distinction";
	}

}
