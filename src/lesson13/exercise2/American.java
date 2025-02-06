package lesson13.exercise2;

import java.text.ParseException;

public class American extends Person{
    public American(String EGN, String name, String sex, String religion, String languageSpoken, String job, String nationality, String countryOfResidence) throws ParseException {
        super(EGN, name, sex, religion, languageSpoken, job, nationality, countryOfResidence);
    }

    public boolean isAmerican() {
        return "american".equalsIgnoreCase(getNationality());
    }


    @Override
    public String getLanguageSpoken() {
        String languages = getNationality().toUpperCase();

        if ("ENGLISH".equalsIgnoreCase(languages)) {
            return "ENGLISH";
        } return "ENGLISH and " + languages;
    }

    @Override
    public String setCountryOfResidence(){
        return "USA";
    }



}
