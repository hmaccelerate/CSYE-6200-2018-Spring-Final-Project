package edu.neu.csye6200;

public class Clock {
	public static int idcount = 1;
	private int id;	// Clock id
	private int h;
	private int m;
	private int repeatType; // 0: One time, 1: Every day, 2: Everyweek by choosing which day
	public int[] repeatWeek = new int[7];
	
	
	
	public Clock(int h, int m, int repeatType) {
		super();
		this.id = idcount;
		idcount += 1;
		this.h = h;
		this.m = m;
		this.repeatType = repeatType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getRepeatType() {
		return repeatType;
	}
	public void setRepeatType(int repeatType) {
		this.repeatType = repeatType;
	}
	
	
	
	
}
