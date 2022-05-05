package com.company;


public class Employee {
    private int id;
    static int counter;
    private String employeeName;
   private int department;
    private int salary;


    public Employee(String employeeName, int department, int salary) {
        this.id=counter++;
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

    public int setSalary() {
        this.salary = salary;
        return salary;
    }


    public String toString() {
        return "Сотрудник " + this.employeeName + ", " + "Отдел " + this.department + ", " + "зарплата " + this.salary;
    }

}




