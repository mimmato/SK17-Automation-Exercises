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
                "turkish",
                "bulgaria"
                );

        System.out.println("EGN is: " + TestPerson.getEGN());

        System.out.println("Date of birth: " + TestPerson.getFirstSixEGN());
        System.out.println("Current age: " + TestPerson.getAge());
        System.out.println("Sex is: " + TestPerson.getSex());

        TestPerson.celebrateEaster();
        System.out.println("You are " + TestPerson.getAge() + " years old in " + TestPerson.countryOfResidence.toUpperCase() + ". " + TestPerson.isAdult());
        TestPerson.isAdult();
        System.out.println(TestPerson.canTakeLoan());
        System.out.println("Spoken language: " + TestPerson.getLanguageSpoken());

        TestPerson.sayHello();

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
                "cleaner",
                "Moldovian",
                "Poland"
        );

        System.out.println("Are you Bulgarian? " + Ganyo.isBulgarian());
        System.out.println("Nationality: " + Ganyo.getNationality());
        System.out.println("Country of residence: " + Ganyo.getCountryOfResidence().toUpperCase());
        System.out.println("Spoken language: " + Ganyo.getLanguageSpoken());
        Ganyo.sayHello();

    System.out.println("-------------------------------");

        American Trump = new American(
                "2907238684",
                "Tosho the American",
                "male",
                "cathOlic",
                "turkish",
                "tech",
                "ENGLISH",
                "somalia"
        );

        System.out.println("Are you American? " + Trump.isAmerican());
        System.out.println("Nationality: " + Trump.getNationality());
        System.out.println("Country of residence: " + Trump.getCountryOfResidence().toUpperCase());
        System.out.println("Spoken language: " + Trump.getLanguageSpoken());
        Trump.sayHello();
        System.out.println("-------------------------------");

        Italian Marco = new Italian(
                "8907238684",
                "Marco the Italian",
                "female",
                "muslim",
                "italian",
                "tech",
                "Georgian",
                "Hungary"
        );

        System.out.println("Are you Italian? " + Marco.isItalian());
        System.out.println("Nationality: " + Marco.getNationality());
        System.out.println("Country of residence: " + Marco.getCountryOfResidence().toUpperCase());
        System.out.println("Spoken language: " + Marco.getLanguageSpoken());
        Marco.sayHello();
        Marco.celebrateEaster();


    }
}

