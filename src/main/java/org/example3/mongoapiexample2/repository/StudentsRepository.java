package org.example3.mongoapiexample2.repository;

import java.util.List;

import org.example3.mongoapiexample2.model.Students;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentsRepository extends MongoRepository<Students, String> {
	List<Students> findByNameAndAddress(String name, String address);

    List<Students> findByNameOrAddress(String name, String address);

    List<Students> findByAgeGreaterThan(int age);

    List<Students> findByAgeLessThan(int age);
    
    list<students> findByAgeAndCgpa(int age,double cgpa);
    List<Students> findByCgpaGreaterThan(double cgpa);

    List<Students> findByCgpaLessThan(double cgpa);
}

