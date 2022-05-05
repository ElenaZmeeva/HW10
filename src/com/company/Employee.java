package com.company;


public class Employee {
    static int idCount = 0;
    private String employeeName;
    int department;
    int salary;

    public Employee(String employeeName, int department, int salary) {
        idCount++;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String toString() {
        return "Сотрудник " + this.employeeName + ", " + "Отдел " + this.department + ", " + "зарплата " + this.salary;
    }

}




