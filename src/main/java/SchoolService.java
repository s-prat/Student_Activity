package src.main.java;

public class SchoolService {

    public static void main(String[] args) {
        Student student = new Student("Peter", "B", 3);
        System.out.println(student.getName());
        student.upgrade();
        System.out.println(student.getGrade());
        student.downgrade();
        System.out.println(student.getGrade());
    }


}
