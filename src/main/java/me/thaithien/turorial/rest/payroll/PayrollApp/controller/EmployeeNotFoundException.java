package me.thaithien.turorial.rest.payroll.PayrollApp.controller;


class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}