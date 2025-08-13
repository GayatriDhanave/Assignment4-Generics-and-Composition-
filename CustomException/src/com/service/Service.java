package com.service;

import com.entity.Employee;
import com.repository.EmployeeRepo;
import com.repository.Repository;

import java.util.List;

public class Service {
    Repository<Employee, Integer> repository=new EmployeeRepo();

    public void saveEmployee(Employee emp){
        repository.save(emp);
    }
    public Employee getEmployeeById(int id){
        return repository.findById(id);
    }

    public List<Employee> findAllEmployees(){
        return repository.findAll();
    }

}
