package com.pluralsight.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import com.pluralsight.repository.ExerciseRepository;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	@Autowired
	ExerciseRepository repository;
	
	public List<Activity> findAllActivities() {
		var result = new ArrayList<Activity>();

		result.add(Activity.of("Run", 30));
		result.add(Activity.of("Bike", 60));
		result.add(Activity.of("Swim", 45));

		return result;
	}

	@Override
	public List<Exercise> findAllExercises() {
		
		return repository.findAllExcercises();
	}
	
	public void addExercise(Exercise exercise)
	{
		repository.addExercise(exercise);
	}
}
