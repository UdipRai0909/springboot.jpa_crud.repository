package com.sursatech.people_mgmt.dao;

import org.springframework.data.repository.CrudRepository;

import com.sursatech.people_mgmt.entities.Person;

public interface PeopleMgmtDao extends CrudRepository<Person, Integer> {

}
