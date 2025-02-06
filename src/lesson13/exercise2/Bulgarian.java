package lesson13.exercise2;

import java.text.ParseException;

public class Bulgarian extends Person {
    public Bulgarian(String EGN, String name, String sex, String religion, String languageSpoken, String job, String nationality, String countryOfResidence) throws ParseException {
        super(EGN, name, sex, religion, languageSpoken, job, nationality, countryOfResidence);
    }


    public boolean isBulgarian() {
        return "bulgarian".equalsIgnoreCase(getNationality());
    }

    @Override
    public String getLanguageSpoken() {
        String languages = getNationality().toUpperCase();

        if ("BULGARIAN".equalsIgnoreCase(languages)) {
            return "BULGARIAN";
        } return "BULGARIAN and " + languages;
    }

    @Override
    public String setCountryOfResidence(){
        return "Bulgaria";
    }

//    @Override
//    public String sayHello() {
//        return "Greeting in BULGARIAN - Здравей!";
//    }
}

