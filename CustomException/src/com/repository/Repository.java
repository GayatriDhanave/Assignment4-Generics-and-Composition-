package com.repository;

import com.entity.Employee;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface Repository<T, ID> {

   public void save(T t);
   public Employee findById(int id);
   public List<Employee> findAll();
}
