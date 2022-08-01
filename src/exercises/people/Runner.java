package exercises.people;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Person p1 = new Person("Dave", 32, "accountant");
		Person p2 = new Person("Sue", 35, "solicitor");
		
		List<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		
		for (Person person : people) {
			System.out.println(person);
		}
		
		
		
//		Scanner scanner1 = new Scanner(System.in);
//		System.out.println("Enter name:");
//		String name = scanner1.nextLine();
//		System.out.println("Enter age");
//		int age = Integer.parseInt(scanner1.nextLine());
//		System.out.println("Enter job title");
//		String jobTitle = scanner1.nextLine();
//		
//		Person person1 = new Person(name, age, jobTitle);
////		person1.setName(name);
////		person1.setAge(age);
////		person1.setJobTitle(jobTitle);
//		
//		System.out.println(person1);
//	}
	}

}
