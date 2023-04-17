package com.example.crudweb.repository;

import com.example.crudweb.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee, Long> {
    //all crud database methods
}
