package com.pluralsight.model;

public class Exercise {

	@Override
	public String toString() {
		return "Exercise [minutes=" + minutes + "]";
	}

	private int minutes;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

}
