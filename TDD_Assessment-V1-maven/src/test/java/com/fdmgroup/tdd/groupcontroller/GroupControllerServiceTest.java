package com.fdmgroup.tdd.groupcontroller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class GroupControllerServiceTest {
	@Test
	public void test_GetAllTrainees_CallsReadGroupMethodOfDatabaseReader_WhenCalled() {
		// Arrange
		DatabaseReader mockReader = mock(DatabaseReader.class);
		DatabaseWriter mockWriter = mock(DatabaseWriter.class);
		GroupController gc = new GroupController(mockReader, mockWriter);
		Map<String, Trainee> traineeList = new HashMap<String, Trainee>();
		// Act
		traineeList = gc.getAllTrainees();
		// Assert
		verify(mockReader, times(1)).readGroup();
		// verified that the readGroup() method from the DatabaseReader class was called
	}

	@Test
	public void test_RemoveTraineeByUsername_CallsDeleteTraineeByUsernameMethodOfDatabaseWriter_WhenCalled() {
		// Arrange
		DatabaseReader mockReader = mock(DatabaseReader.class);
		DatabaseWriter mockWriter = mock(DatabaseWriter.class);
		GroupController gc = new GroupController(mockReader, mockWriter);

		// Act
		gc.removeTraineeByUsername("Garry");

		// Assert
		verify(mockWriter, times(1)).deleteTraineeByUsername("Garry");
		// verified that the deleteTraineeByUsername() method from the DatabaseWriter class was called
	}

	@Test
	public void test_AddTrainee_CallsAddTraineeMethodOfDatabaseWriter_WhenCalled() {
		// Arrange
		DatabaseReader mockReader = mock(DatabaseReader.class);
		DatabaseWriter mockWriter = mock(DatabaseWriter.class);
		GroupController gc = new GroupController(mockReader, mockWriter);
		Trainee trainee = new Trainee();
		// Act
		gc.addTrainee(trainee);
		// Assert
		verify(mockWriter, times(1)).addTrainee(trainee);
		// verified that the AddTrainee() method from the DatabaseWriter class was called
	}

}
