package com.qa.example;

public class Results {

	private int physics;
	
	private int chemistry;
	private int biology;

	private int total;
	private double percentage;
	
	public void method1() {
		System.out.println("Physics "+physics);
		System.out.println("Chemistry "+chemistry);
		System.out.println("Biology " + biology);
		System.out.println("Total "+getTotal() );
	}
	
	public void method2() {
		percentage = 100 * getTotal() / 450;
		System.out.println(percentage);
	}
	
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getBiology() {
		return biology;
	}
	public void setBiology(int biology) {
		this.biology = biology;
	}
	public int getTotal() {
		return physics + chemistry + biology;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
}
