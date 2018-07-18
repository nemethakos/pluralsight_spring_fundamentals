package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {

	private List<Exercise> exerciseList = new ArrayList<Exercise>(); 
	
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.ExerciseRepository#findAllExcercises()
	 */
	@Override
	public List<Exercise> findAllExcercises() {
		return exerciseList;
	}
	
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.ExerciseRepository#addExercise(com.pluralsight.model.Exercise)
	 */
	@Override
	public void addExercise(Exercise exercise) {
		exerciseList.add(exercise);
	}
}
