package lesson13.exercise2;

import java.text.ParseException;

public class l13_e1_Main {
    public static void main(String[] args) throws ParseException {

        Person TestPerson = new Person(
                "9507238684",
                "Tosho",
                "male",
                "cathOlic",
                "bulgarian",
                "tech",
                "Bulgarian",
                "bulgaria"
                );

        System.out.println("EGN is: " + TestPerson.getEGN());

        System.out.println("Date of birth: " + TestPerson.getFirstSixEGN());
        System.out.println("Current age: " + TestPerson.getAge());
        System.out.println("Sex is: " + TestPerson.getSex());
        TestPerson.sayHello();
        TestPerson.celebrateEaster();
        System.out.println("You are " + TestPerson.getAge() + " years old in " + TestPerson.countryOfResidence.toUpperCase() + ". " + TestPerson.isAdult());
        TestPerson.isAdult();
        System.out.println(TestPerson.canTakeLoan());
    }
}

