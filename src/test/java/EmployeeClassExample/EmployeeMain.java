package EmployeeClassExample;

import EmployeeClassExample.Employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee emp1 = new Employee(); //object 1

        emp1.eid = 101;
        emp1.sal = 4500;
        emp1.ename = "Tsveti";
        emp1.job = "Tester";
        emp1.display();

        // System.out.println(emp1.eid);

        Employee emp2 = new Employee(); //object 2

        emp2.eid = 102;
        emp2.sal = 4500;
        emp2.ename = "Tsvetozara";
        emp2.job = "QA Tester";
        emp2.display();
    }
}
