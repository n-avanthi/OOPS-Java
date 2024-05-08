// Give an application that fits the following inheritance hierarchy and write the program for the same. Each 
// class should have atleast two data members and two function members.

package CO4.Worksheet1;

interface Internal {
    int getInternalMarks();
}

interface External {
    int getExternalMarks();
}

class Student {
    String name;
    int studentID;
 
    Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
    }
}
 
class Results extends Student implements Internal, External {
    int internalMarks;
    int externalMarks;

    Results(String name, int studentID, int internalMarks, int externalMarks) {
        super(name, studentID);
        this.internalMarks = internalMarks;
        this.externalMarks = externalMarks;
    }

    public int getInternalMarks() {
        return internalMarks;
    }

    public int getExternalMarks() {
        return externalMarks;
    }
 
    void displayTotalMarks() {
        System.out.println("Total Marks: " + (internalMarks + externalMarks));
    }
}

public class StudentHeirarchy {
    public static void main(String[] args) {
        Results objResults = new Results("XYZ", 9012, 85, 75);
        objResults.displayInfo();
        System.out.println("Internal Marks: " + objResults.getInternalMarks());
        System.out.println("External Marks: " + objResults.getExternalMarks());
        objResults.displayTotalMarks();
    }
}
 

