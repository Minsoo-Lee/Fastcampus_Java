package ch24;

import java.util.ArrayList;

public class Student {
    private int studentNum;
    private String studentName;

    ArrayList<Subject> subjects = new ArrayList<>();

    public Student(int studentNum, String studentName){
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public void addSubject(String subjectName, int score) {
        subjects.add(new Subject(subjectName, score));
    }

    public void showStudentInfo() {
        int total = 0;
        for (Subject subject : subjects){
            System.out.println("학생 " + studentName + "의 " + subject.getSubjectName() + " 과목 성적은 " + subject.getScore() + "입니다.");
            total += subject.getScore();
        }
        System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
    }
}
