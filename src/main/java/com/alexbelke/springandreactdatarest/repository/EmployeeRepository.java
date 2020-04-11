package com.alexbelke.springandreactdatarest.repository;

import com.alexbelke.springandreactdatarest.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
