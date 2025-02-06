package lesson13.exercise2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

    private final String name;
    private final String sex;
    private final String religion;
    private final String languageSpoken;
    private final String nationality;
    private final String EGN;
    private final String dateOfBirth;
    private final int age;
    public String countryOfResidence;
    public String job;


    public Person(String EGN, String name, String sex, String religion, String languageSpoken, String job, String nationality, String countryOfResidence) throws ParseException {

        setEGNifValid(EGN);
        this.EGN = EGN;

        this.sex = sex;
        setSex(sex);

        this.name = name;

        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.age = getAge();
        this.nationality = nationality;
        this.dateOfBirth = getFirstSixEGN();
        this.countryOfResidence = countryOfResidence;

    }

    public String getFirstSixEGN() throws ParseException {
        String firstSix = EGN.substring(0, 6);
        firstSix = "19" + firstSix;
//        System.out.println(firstSix);
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = inputFormat.parse(firstSix);

        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MMM/yyyy");
        return outputFormat.format(date);
    }

    private int setAge(String EGN) {
        int firstTwo = Integer.parseInt(EGN.substring(0, 2));
        int currentYear = 2025;
        int concatenatedYear = 1900 + firstTwo;
        return currentYear - concatenatedYear;
    }

    public int getAge() {
        return setAge(EGN);
    }


    String getEGN() {
        return EGN;
    }

    private void setEGNifValid(String EGN) {
        if (EGN == null || EGN.length() != 10) {
            throw new IllegalArgumentException("The provided EGN is not 10 digits: " + EGN);
        }
        if (!(EGN.matches("^\\d{10}$"))) {
            throw new IllegalArgumentException("The provided EGN is not only digits," + EGN);
        }
    }


    public String getSex() {
        return sex;
    }

    private void setSex(String sex) {
        if (!("male".equalsIgnoreCase(sex) || "female".equalsIgnoreCase(sex))) {
            System.out.println("The specified sex is incorrect: " + sex);
            System.out.println("Continue program execution...");
        }
    }


//    public void sayHello() {
//        if ("bulgarian".equalsIgnoreCase(this.languageSpoken)) {
//            System.out.println("Greeting in " + this.languageSpoken.toUpperCase() + " - Здравей!");
//        } else if ("italian".equalsIgnoreCase(this.languageSpoken)) {
//            System.out.println("Greeting in " + this.languageSpoken.toUpperCase() + " - Ciao!");
//        } else if ("english".equalsIgnoreCase(this.languageSpoken)) {
//            System.out.println("Greeting in " + this.languageSpoken.toUpperCase() + " - Hello!");
//        } else {
//            System.out.println("Language " + this.languageSpoken.toUpperCase() + " is unknown - Hello!");
//        }
//        }

    public void sayHello2() {
        if ("bulgarian".equalsIgnoreCase(this.nationality)) {
            System.out.println("Greeting in " + this.nationality.toUpperCase() + " - Здравей!");
        } else if ("italian".equalsIgnoreCase(this.nationality)) {
            System.out.println("Greeting in " + this.nationality.toUpperCase() + " - Ciao!");
        } else {
            System.out.println("Language " + this.nationality.toUpperCase() + " is unknown - Hello!");
        }
    }

    public void sayHello3() {
        String languages = getLanguageSpoken();
        boolean toGreet = false;

        if (languages.contains("BULGARIAN")) {
            System.out.println("Greeting in Bulgarian - Здравей!");
            toGreet = true;
        }
        if (languages.contains("ITALIAN")) {
            System.out.println("Greeting in Italian - Ciao!");
            toGreet = true;
        }
        if (languages.contains("ENGLISH")) {
            System.out.println("Greeting in English - Hello!");
            toGreet = true;
        }

        if (!toGreet) {
            System.out.println("Languages are unknown - Greeting with Hello!");

        }
    }

//    public void sayHello3() {
//        String languages = getLanguageSpoken();
//
//        if (languages.contains("BULGARIAN")) {
//            System.out.println("Greeting in Bulgarian - Здравей!");
//        }
//        if (languages.contains("ITALIAN")) {
//            System.out.println("Greeting in Italian - Ciao!");
//        }
//        if (languages.contains("ENGLISH")) {
//            System.out.println("Greeting in English - Hello!");
//        }
//
//        if (!languages.contains("BULGARIAN") && !languages.contains("ITALIAN") && !languages.contains("ENGLISH")) {
//            System.out.println("Languages are unknown - Greeting with Hello!");
//        }
//    }



    public void celebrateEaster() {
        if (!("Orthodox".equalsIgnoreCase(this.religion) || "Catholic".equalsIgnoreCase(this.religion))) {
            System.out.println("Person does NOT celebrate Easter!");
        } else {
            System.out.println("Person celebrates Easter!");
        }
    }

    public String isAdult() {
        if (("Bulgaria".equalsIgnoreCase(this.countryOfResidence) || "Italy".equalsIgnoreCase(this.countryOfResidence)) && this.age >= 18) {
            return "You are an adult!";
        } else if ("USA".equalsIgnoreCase(this.countryOfResidence) && this.age >= 21) {
            return "You are an adult!";
        } else {
            return "You are NOT an adult!";
        }
    }
    public String canTakeLoan() {
            if (this.job != null && !this.job.isEmpty() && this.job.length() > 3){
                return "Person CAN take a loan.";
            } else{
                return "Person CANNOT take a loan.";
            }
        }

    public String getJob() {
        return this.job;
    }

    public void setNationality(){
    }
    public String getNationality(){
        return this.nationality.toUpperCase();
    }

    public void setLanguageSpoken(){

    }
    public String getLanguageSpoken(){
        return this.languageSpoken;
    }

    public String setCountryOfResidence(){
        return this.countryOfResidence.toUpperCase();
    }
}
