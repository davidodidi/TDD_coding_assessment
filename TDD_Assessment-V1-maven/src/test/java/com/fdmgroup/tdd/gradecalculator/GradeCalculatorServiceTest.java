package com.fdmgroup.tdd.gradecalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class GradeCalculatorServiceTest {
	@Test
	public void test_getClassifiationMethodReturnsFailWhenGivenLessThan75() {

		// Arrange
		GradeCalculator calc = new GradeCalculator();
		String grade;

		// Act
		grade = calc.getClassification(74);

		// Assert
		assertTrue(grade.equals("fail")); // test whether grade is "fail"

	}

	@Test
	public void test_getClassifiationMethodReturnsPassWhenGiven75OrMoreButLessThan80() {

		// Arrange
		GradeCalculator calc = new GradeCalculator();
		String grade;

		// Act
		grade = calc.getClassification(77);

		// Assert
		assertTrue(grade.equals("pass")); // test whether grade is "pass"

	}

	@Test
	public void test_getClassifiationMethodReturnsMeritWhenGiven80OrMoreButLessThan90() {

		// Arrange
		GradeCalculator calc = new GradeCalculator();
		String grade;

		// Act
		grade = calc.getClassification(86);

		// Assert
		assertTrue(grade.equals("merit")); // test whether grade is "merit"

	}

	@Test
	public void test_getClassifiationMethodReturnsDistinctionWhenGiven90OrMoreButLessThanOrEqualTo100() {

		// Arrange
		GradeCalculator calc = new GradeCalculator();
		String grade;

		// Act
		grade = calc.getClassification(99);

		// Assern
		assertTrue(grade.equals("distinction")); // test whether grade is "distinction"

	}
}
