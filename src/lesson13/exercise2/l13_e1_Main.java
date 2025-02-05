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
        System.out.println("Spoken language: " + TestPerson.getLanguageSpoken());

        System.out.println("-------------------------------");


        Child littleChild = new Child(
                "9907238684",
                "Tosho Junior",
                "male",
                "cathOlic",
                "spanish",
                "tech",
                "Bulgarian",
                "bulgaria"
        );
        littleChild.isChild();

        System.out.println("EGN is: " + littleChild.getEGN());
        System.out.println("Date of birth: " + littleChild.getFirstSixEGN());
        littleChild.sayHello();
        System.out.println("job: " + littleChild.getJob());
        System.out.println(littleChild.canTakeLoan());
        System.out.println("Age: " + littleChild.getAge());
        System.out.println("Spoken language: " + littleChild.getLanguageSpoken());
        System.out.println("-------------------------------");

        Bulgarian Ganyo = new Bulgarian(
                "8907238684",
                "Tosho the Bulgarian",
                "male",
                "cathOlic",
                "Turkish",
                "tech",
                "Irish",
                "bulgaria"
        );

        System.out.println("Nationality: " + Ganyo.getNationality());
        Ganyo.isBulgarian();
        System.out.println("Spoken language: " + Ganyo.getLanguageSpoken());
        System.out.println(Ganyo.sayHello());
        System.out.println("-------------------------------");

        American Trump = new American(
                "2907238684",
                "Tosho the Bulgarian",
                "male",
                "cathOlic",
                "Turkish",
                "tech",
                "Irish",
                "bulgaria"
        );

        System.out.println("Nationality: " + Trump.getNationality());
        Trump.isAmerican();
        System.out.println("Spoken language: " + Trump.getLanguageSpoken());
        System.out.println(Trump.sayHello());
    }
}

