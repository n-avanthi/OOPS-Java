// Write a Java program that creates a class hierarchy for employees of a company. The base class should be 
// Employee, with subclasses Teacher, Lecturer, and Professor. Each subclass should have properties such as name, 
// address, salary, and job title. Implement methods for calculating salary, bonuses, generating performance reports. 
// (Hint: use super keyword, basic salary for professor=50,000, basic salary for lecturer=40000, basic salary for 
// teacher=30000, hra=12%, da=7%, bonus=2%, print any one these string for performance reports –excellent, good, 
// satisfied)

package CO3.Activity_Set_2;

class Employee {
    String name, address, jobTitle;
    double salary;

    Employee() {
        System.out.println("displayed the details of employee");
    }

    void Salary() {
        System.out.println(salary+(0.12*salary)+(0.07*salary));
    }

    void Bonus() {
        System.out.println(0.02*salary);
    }

    void PerformanceReport() {
        System.out.println("excellent");
    }
}

class Teacher extends Employee {
    Teacher(String name, String address, String jobTitle, double salary) {
        super();
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.salary = salary;

        System.out.println(name + " " + address + " " + jobTitle + " " + salary);
    }
}

class Lecturer extends Employee {
    Lecturer(String name, String address, String jobTitle, double salary) {
        super();
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.salary = salary;

        System.out.println(name + " " + address + " " + jobTitle + " " + salary);
    }
}

class Professor extends Employee {
    Professor(String name, String address, String jobTitle, double salary) {
        super();
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.salary = salary;

        System.out.println(name + " " + address + " " + jobTitle + " " + salary);
    }
}

public class Employees {
    public static void main(String[] args) {
        Teacher objTeacher = new Teacher("Rani", "Bengaluru", "Assistant Teacher", 5000);
        objTeacher.Salary();
        objTeacher.Bonus();
        objTeacher.PerformanceReport();

        Lecturer objLecturer = new Lecturer("Anjali", "Bengaluru", "Assistant Lecturer", 6000);
        objLecturer.Salary();
        objLecturer.Bonus();
        objLecturer.PerformanceReport();

        Professor objProfessor = new Professor("Rahul", "Bengaluru", "HOD", 10000);
        objProfessor.Salary();
        objProfessor.Bonus();
        objProfessor.PerformanceReport();
    }
}



