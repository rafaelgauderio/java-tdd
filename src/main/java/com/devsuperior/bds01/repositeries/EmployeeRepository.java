package com.devsuperior.bds01.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds01.entities.Department;

public interface EmployeeRepository extends JpaRepository <Department, Long> {

}
