package com.fdmgroup.tdd.groupcontroller;

import java.util.Map;

public class GroupController implements GroupControllerService {
	DatabaseReader r = new DatabaseReader();
	DatabaseWriter w = new DatabaseWriter();

	public GroupController(DatabaseReader mockReader, DatabaseWriter mockWriter) {
		r = mockReader;
		w = mockWriter;
	}

	@Override
	public Map<String, Trainee> getAllTrainees() {
		// TODO Auto-generated method stub

		return r.readGroup();
	}

	@Override
	public void addTrainee(Trainee trainee) {
		w.addTrainee(trainee);

	}

	@Override
	public void removeTraineeByUsername(String traineeUsername) {
		w.deleteTraineeByUsername(traineeUsername);

	}

}
