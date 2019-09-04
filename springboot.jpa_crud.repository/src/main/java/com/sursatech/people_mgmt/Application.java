package com.sursatech.people_mgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
//	private PeopleMgmtService peopleMgmtService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
// 		createPerson();
//		createManyPerson();
//		getPersonByIds();
//		deletePersonEntity();
//		updatePersonEmailById();
//		updatePerson();
	}

//	private void updatePerson() {
//		peopleMgmtService.updatePerson(1);
//	}

//	private void updatePersonEmailById() {
//		peopleMgmtService.updatePersonEmailById(1, "yakkhaudip@gmail.com");
//	}

//	private void deletePersonEntity() {
//		Person person = new Person();
//		person.setId(6);
//		peopleMgmtService.deletePersonEntity(person);
//	}

//	private void getPersonByIds() {
//		List<Integer> ids = new ArrayList<>();
//		ids.add(1);
//		ids.add(2);
//		ids.add(5);
//		ids.add(6);
//		Iterable<Person> personList = peopleMgmtService.getPersonByIds(ids);
//		personList.forEach(System.out::println);
//	}

//	private void createManyPerson() {
//		List<Person> personList = Arrays.asList(
//									new Person("Udip", "Rai", "hmm@gmail.com", new Date()), 
//									new Person ("Susan", "Rai", "hello@gmail.com", new Date()), 
//									new Person ("Utsa", "Rai", "world@gmail.com", new Date()));
//		Iterable<Person> createPersons = peopleMgmtService.createManyPerson(personList);
//		for(Person p : createPersons) {
//			System.out.println(p);
//		}
//	}

//	private void createPerson() {
//		Person person1 = new Person("Udip", "Rai", "udiprai@gmail.com", new Date());
//		Person personDb = peopleMgmtService.createPerson(person1);
//		System.out.println(personDb);
//	}

}
