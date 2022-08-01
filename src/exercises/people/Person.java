package exercises.people;

public class Person {
	//instance variables
	private String name;
	private int age;
	private String jobTitle;
	
	
	
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	//instance methods
	
	@Override
	public String toString() {
		return name + " age: " + age + " job title "+jobTitle;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
