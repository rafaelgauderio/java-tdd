package com.devsuperior.bds01.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds01.entities.Department;

public interface DepartmentRepository extends JpaRepository <Department, Long> {

}
