package src.main.java;

import java.util.Arrays;

public class Student {

    private String name;
    private String grade;
    private int group;
    private String secretNickName;

    private static final Integer[] GROUPS = new Integer[]{1, 2, 3, 4, 5};
    private static final String[] GRADES = new String[]{"A","B","C","D","E","F"};

    public Student(String name, String grade, int group) {
        this.name = name;
        checkAndAssignGrade(grade);
        checkAndAssignGroup(group);
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void checkAndAssignGrade(String grade) {
        if(Arrays.asList(GRADES).contains(grade)) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Grade is not valid. Its value can be between A to F");
        }
    }

    private void setSecretNickName(){
        this.secretNickName = "MySecretNickName";
    }

    public void checkAndAssignGroup(int group) {
        if(Arrays.asList(GROUPS).contains(group)) {
            this.group = group;
        } else {
            throw new IllegalArgumentException("Group is not valid. Its value can be between 1 to 5");
        }
    }

    public void upgrade() {
        for(int i=0;i<GRADES.length;i++) {
            if(GRADES[i] == this.grade) {
                this.grade = GRADES[i-1];
                break;
            }
        }
    }

    public void downgrade() {
        for(int i=0;i<GRADES.length;i++) {
            if(GRADES[i] == this.grade && i<GRADES.length) {
                this.grade = GRADES[i+1];
                break;
            }
        }
    }
}
