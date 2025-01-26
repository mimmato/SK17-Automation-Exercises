package lesson9;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    public String studentName;
    public double[] grades;
    public double averageGrade;


    public Student(String studentName, double[] grades){

        this.studentName = studentName;

        for (double i : grades) {
            if (i < 2.0 || i > 6.0) {
                throw new IllegalArgumentException("Grades cannot be less than 2.0 and higher than 6.0. Value to fix: " + i);
            }
        }

        this.grades = grades;

        this.averageGrade = averageGrade();
    }

    public void printStudentInfo(){
        System.out.println("Student name: " + this.studentName);
        System.out.println("Grades: " + Arrays.toString(this.grades));

        System.out.println("Average grade of " + this.studentName + " is " + this.averageGrade);
    }

    public double averageGrade(){
        double sum = 0;
        for (double i : grades){
            sum += i;
        }
        return sum / grades.length;
    }
}
