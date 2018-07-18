package com.pluralsight.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class Exercise {

	@Override
	public String toString() {
		return "Exercise [activity=" + activity + ", minutes=" + minutes + "]";
	}

	@NotNull
	private String activity;

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}
	@Range(min=1,max=120)
	private int minutes;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

}
