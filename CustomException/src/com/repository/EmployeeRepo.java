package com.repository;

import com.entity.Employee;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeRepo implements  Repository<Employee, Integer> {

    Map<Integer, Employee> employees= new LinkedHashMap<>();

    @Override
    public  void save(Employee emp){
        employees.put(emp.getId(), emp);
    }

    @Override
    public Employee findById (int id) {
        return employees.get(id);
    }

    @Override
    public List<Employee> findAll () {
        List<Employee> emplist=employees.values().stream().collect(Collectors.toList());
        return emplist;
    }

}
