package com.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interfaced used for: (CRUD)
 * Create new employees
 * Update existing employees
 * Delete employees
 * Find employees
 * */
interface EmployeeRepository extends JpaRepository<Employee, Long> {

}