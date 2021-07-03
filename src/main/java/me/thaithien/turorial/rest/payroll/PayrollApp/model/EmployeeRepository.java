package me.thaithien.turorial.rest.payroll.PayrollApp.model;

import me.thaithien.turorial.rest.payroll.PayrollApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Long is id type of Employee
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}