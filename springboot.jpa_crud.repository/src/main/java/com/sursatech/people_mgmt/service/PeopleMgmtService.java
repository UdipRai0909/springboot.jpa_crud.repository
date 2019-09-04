package com.sursatech.people_mgmt.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sursatech.people_mgmt.dao.PeopleMgmtDao;
import com.sursatech.people_mgmt.entities.Person;

@Service
public class PeopleMgmtService {

	@Autowired
	private PeopleMgmtDao peopleMgmtDao;
	
	public Person createPerson(Person person1) {
		// TODO Auto-generated method stub
		return peopleMgmtDao.save(person1);
	}

	public Iterable<Person> createManyPerson(List<Person> personList) {
		// TODO Auto-generated method stub
		Iterable<Person> list = peopleMgmtDao.saveAll(personList);
		return list;
	}

	public Iterable<Person> getPersonByIds(List<Integer> ids) {
		return peopleMgmtDao.findAllById(ids);
	}

	public void deletePersonEntity(Person person) {
		peopleMgmtDao.delete(person);
	}

	public void updatePersonEmailById(int id, String newEmail) {
		Person person = peopleMgmtDao.findById(id).get();
		if(id==person.getId()) {
			person.setEmail(newEmail);
		}
		peopleMgmtDao.save(person);
	}

	public void updatePerson(int id) {
		Person person = peopleMgmtDao.findById(id).get();
		if(id==person.getId()) {
			person.setFirstName("Rowdy");
			person.setLastName("Rathore");
			person.setEmail("thebest@gmail.com");
			person.setCreationDate(new Date());
		}
		peopleMgmtDao.save(person);
		
	}
	
	
}
