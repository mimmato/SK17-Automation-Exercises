package lesson13.exercise2;

import java.text.ParseException;

public class Bulgarian extends Person {
    public Bulgarian(String EGN, String name, String sex, String religion, String languageSpoken, String job, String nationality, String countryOfResidence) throws ParseException {
        super(EGN, name, sex, religion, languageSpoken, job, nationality, countryOfResidence);
    }

    public void isBulgarian() {
        if (!("bulgarian".equalsIgnoreCase(getNationality()))) {
            System.out.println("You are NOT Bulgarian!");
        } else {
            System.out.println("You are Bulgarian");
        }
    }

    public String sayHello() {
        return "Здравей";
    }

    @Override
    public String getLanguageSpoken() {
        return "Bulgarian";
    }



}

