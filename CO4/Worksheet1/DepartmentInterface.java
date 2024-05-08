// Create an interface Department containing attributes deptName and deptHead. It also has methods for printing the 
// attributes. Create a class hostel containing hostelName, hostelLocation and numberOfRooms. The class contains
// method printing the attributes. Then write Student class extending the Hostel class and implementing the Department
// interface. This class contains attributes studentName, regdNo, electiveSubject and avgMarks. Write suitable 
// printData method for this class. Also, implement the methods of the Department interface.

package CO4.Worksheet1;

interface Department {
    String deptName = "CSE";
    String deptHead = "Dean";
    void printDeptDetails();
}

class Hostel {
    String hostelName, hostelLocation;
    int numberOfRooms;

    public Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    void printHostelDetails() {
        System.out.println(this.hostelName + " " + this.hostelLocation + " " + this.numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName, regdNo, electiveSubject;
    double avgMarks;

    public Student(String studentName, String regdNo, String electiveSubject, double avgMarks, String hostelName, String hostelLocation, int numberOfRooms) {
        super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.electiveSubject = electiveSubject;
        this.regdNo = regdNo;
        this.avgMarks = avgMarks;
    }

    void printData() {
        super.printHostelDetails();
        System.out.println(this.studentName + " " + this.electiveSubject + " " + this.regdNo);
    }

    public void printDeptDetails() {
        System.out.println(deptHead + " " + deptName);
    }
}

public class DepartmentInterface {
    public static void main(String[] args) {
        Student objStudent = new Student("Avanthi", "12345", "Music", 95, "XYZ", "Byp", 155);
        objStudent.printData();
        objStudent.printDeptDetails();
    }
}