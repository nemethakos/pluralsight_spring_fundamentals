package com.pluralsight.model;

public class Goal {
	private int minutes;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	@Override
	public String toString() {
		return "Goal [minutes=" + minutes + "]";
	}
}
