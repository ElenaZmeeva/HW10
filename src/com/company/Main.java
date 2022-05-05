package com.company;

import java.util.Arrays;

public class Main {
    public static void salarySum(Employee[] salary) {
        int sum = 0;
        for (Employee employee : salary) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: "+ sum);
    }


    public static void salaryMax(Employee[] employees ) {
       Employee max =null;
       for (Employee employee: employees){
           if( max==null || employee.getSalary()> max.getSalary()){
               max = employee;
           }
       }
        System.out.println("Сотрудник с максимальной зарплатой: "+ max);
    }

    public static void  salaryMin (Employee[] employees){
        Employee min = null;
        String minName;
        for (Employee employee: employees) {
            if (min ==null || employee.getSalary() < min.getSalary()){
             min = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: "+  min);
    }
    public static void avarageSalary(Employee[] salary) {
        int avarage=0;
        if (salary.length>0){
        }
        int sum = 0;
        for (Employee employee : salary) {
            sum += employee.getSalary();
        }
        avarage= sum/ salary.length;
        System.out.println(" Среднее значение зарплат: "+ avarage);
    }

    public static void allName (Employee[]employees){
        String name;
        for (Employee employee : employees){
            System.out.println(  employee.getEmployeeName());
        }
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Ivanov Ivan ", 1, 89000);
        employee[1] = new Employee("Petrov Petr ", 2, 56000);
        employee[2] = new Employee("Semenov Semen ", 3, 97000);
        employee[3] = new Employee("Barsukov Stepan ", 4, 64000);
        employee[4] = new Employee("Kosatkina Olga ", 5, 83000);
        employee[5] = new Employee("Komarova Yana ", 5, 71000);
        employee[6] = new Employee("Lobanov Oleg ", 4, 88000);
        employee[7] = new Employee("Kirillov Kirill ", 3, 104000);
        employee[8] = new Employee("Kolos Sofia ", 2, 100400);
        employee[9] = new Employee("Sidorov Ivan ", 1, 97000);

        int idCount = Employee.idCount;
        System.out.println(Employee.idCount);

        System.out.println(Arrays.toString(employee));
        salarySum(employee);

        salaryMax(employee);

        salaryMin(employee);

        avarageSalary(employee);

        System.out.println("Список сотрудников: ");
        allName(employee);

    }

}

