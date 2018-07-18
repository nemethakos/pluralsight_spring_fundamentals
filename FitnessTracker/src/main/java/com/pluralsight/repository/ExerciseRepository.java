package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Exercise;

public interface ExerciseRepository {

	List<Exercise> findAllExcercises();

	void addExercise(Exercise exercise);

}