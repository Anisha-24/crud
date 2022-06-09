package com.anisha.crud.repository;

import com.anisha.crud.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee, Integer> {
}
