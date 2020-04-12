package com.alexbelke.springandreactdatarest.repository;

import com.alexbelke.springandreactdatarest.domain.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
}
