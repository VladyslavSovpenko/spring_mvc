package com.vss.spring.mvc;


import com.vss.spring.mvc.validation.CheckMail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "Min 2 symbol")
    private String name;
    //    @NotEmpty(message = "must be not null")
    @NotBlank(message = "must be not null")
    private String surname;
    @Min(value = 500, message = "should be more then 500")
    @Max(value = 1000, message = "should be less then 1000")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String auto;
    private Map<String, String> autoMap;
    private String[] languages;
    private Map<String, String> languagesList;
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}", message = "please use pattern XXX-XXX-XXXX")
    private String phoneNumber;
    @CheckMail(value = "abc.com", message = "abc.com")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("HumanResource", "HR");
        departments.put("InfoTech", "IT");
        departments.put("Sales", "Sales");

        autoMap = new HashMap<>();
        autoMap.put("BMW", "BMW");
        autoMap.put("Audi", "Audi");
        autoMap.put("Mercedes-Benz", "MB");

        languagesList = new HashMap<>();
        languagesList.put("Eng", "English");
        languagesList.put("Deutsch", "DE");
        languagesList.put("France", "FR");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
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

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Map<String, String> getAutoMap() {
        return autoMap;
    }

    public void setAutoMap(Map<String, String> autoMap) {
        this.autoMap = autoMap;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
