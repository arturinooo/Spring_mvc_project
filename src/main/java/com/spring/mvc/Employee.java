package com.spring.mvc;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "name must be min 2 symbols!")
    private String name;
    @NotBlank(message = "surname is required field!")
    private String surname;
    @Min(value = 0, message = "salary must be greater than 0")
    private int salary;
    private String department;
    private String carBrand;
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XXX-XX-XX")
    private String phoneNumber;
    private Map<String, String> departmentMap;
    private Map<String, String> carBrands;

    public Employee() {
        departmentMap = new HashMap<String, String>();
        departmentMap.put("IT", "Information Technology");
        departmentMap.put("HR", "Human Resources");
        departmentMap.put("Sales", "Sales");
        carBrands = new HashMap<String, String>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Mercedes-Benz", "Mercedes");
        carBrands.put("Audi", "Audi");
        carBrands.put("Accent", "Accent");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getDepartmentMap() {
        return departmentMap;
    }

    public void setDepartmentMap(Map<String, String> departmentMap) {
        this.departmentMap = departmentMap;

    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
