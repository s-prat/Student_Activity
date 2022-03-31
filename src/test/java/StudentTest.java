package src.test.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import src.main.java.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {
    private Student student;

    @Test
    public void testUpgrade() {
        student = new Student("Peter", "C", 5);
        student.upgrade();
        assertEquals("B", student.getGrade());
    }

    @Test
    public void testDowngrade() {
        student = new Student("Peter", "C", 5);
        student.downgrade();
        assertEquals("D", student.getGrade());
    }

    @Test
    public void testInvalidGrade() {
        student = new Student("Peter", "G", 5);
        assertThrows(IllegalArgumentException.class, () -> student.checkAndAssignGrade("G"));
    }

    @Test
    public void testInvalidGroup() {
        student = new Student("Peter", "B", 7);
        assertThrows(IllegalArgumentException.class, () -> student.checkAndAssignGroup(7));
    }


}