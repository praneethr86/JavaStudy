package filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("praneeth","male","single"));
		persons.add(new Person("hugh","male","married"));
		persons.add(new Person("brad", "male", "married"));
		persons.add(new Person("angelina", "female", "single"));
		persons.add(new Person("Meryl", "female", "married"));
		persons.add(new Person("Julia","female","married"));
		persons.add(new Person("Nico","male","single"));
		persons.add(new Person("Lewis","male","single"));
		
		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleOrFemale = new OrCriteria(single, female);
		
		System.out.println("Males:");
		printPersons(male.meetCriteria(persons));
		System.out.println("Females:");
		printPersons(female.meetCriteria(persons));
		System.out.println("Single:");
		printPersons(single.meetCriteria(persons));
		System.out.println("Single and Male:");
		printPersons(singleMale.meetCriteria(persons));
		System.out.println("Single or Female:");
		printPersons(singleOrFemale.meetCriteria(persons));
		
	}
	

	public static void printPersons(List<Person> personsList){
		for(Person person: personsList){
			System.out.println("Person: [Name:"+person.getName() +
					",Gender:"+person.getGender()+",MaritalStatus:"+person.getMaritalStatus()+"]");
		}
	}

}
