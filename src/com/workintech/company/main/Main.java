package com.workintech.company.main;

import com.workintech.company.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1,"Cenk", "Yurdakul"));
        employees.add(new Employee(1,"Cenk", "Yurdakul"));
        employees.add(new Employee(2,"Alp", "Yurdakul"));
        employees.add(new Employee(2,"Alp", "Yurdakul"));
        employees.add(new Employee(3,"Ezgi", "Ayik"));
        employees.add(new Employee(3,"Ezgi", "Ayik"));
        employees.add(new Employee(4,"Helin", "Gunes"));
        employees.add(new Employee(4,"Helin", "Gunes"));

        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();

        Iterator iterator = employees.iterator();
        while(iterator.hasNext()){
            Employee employee = (Employee)iterator.next();
            if(employee == null){
                System.out.println("Null data bulundu.");
                continue;
            }
            if(employeeMap.containsKey(employee.getId())){
                removedEmployees.add(employee);
                iterator.remove();
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }

        System.out.println(employees);
        System.out.println(employeeMap);
        System.out.println("REMOVED: " + removedEmployees);
    }
}