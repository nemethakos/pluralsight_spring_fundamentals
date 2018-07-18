package com.pluralsight.model;

public class Activity {
	/**
	 * Creates new {@link Activity} with the {@code description}
	 */
	public static Activity of(String description, int minutes) {
		return new Activity(description, minutes);
	}

	private String desc;
	private int minutes;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public Activity(String desc, int minutes) {
		super();
		this.desc = desc;
		this.minutes = minutes;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Activity [desc=" + desc + ", minutes=" + minutes + "]";
	}

}
