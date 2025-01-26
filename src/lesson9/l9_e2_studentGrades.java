package lesson9;

public class l9_e2_studentGrades {

    public static void main(String[] args) {


        System.out.println("Students list by names and grades: ");
        System.out.println("---------------------");


        Student student1 = new Student("Jack", new double[]{2.0, 3.5, 5.0});

        student1.printStudentInfo();

        System.out.println("---------------------");
        Student student2 = new Student("Bob", new double[]{6.0, 5.5, 4.5});

        student2.printStudentInfo();

        // average calc
        // take new double array for each student, do sum and do divide by num



    }

}
