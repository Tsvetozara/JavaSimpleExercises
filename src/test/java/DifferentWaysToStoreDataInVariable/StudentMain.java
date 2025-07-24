package DifferentWaysToStoreDataInVariable;

public class StudentMain {

    public static void main(String[] args) {

        //Different ways to store data into variables

        // Student stu = new Student();

        // 1) Using object reference variables to store the data

        // stu.sid = 101;
        // stu.sname = "Tsveti";
        // stu.grade = 'A';

        // stu.printStudentData();

        // 2) Using method to store the data

        //  stu.setStudentData(201, "Boris", 'A');
        // stu.printStudentData();

        // 3) Using constructor

        Student stu = new Student(101, "Tsveti", 'A');
        stu.printStudentData();

    }

}
