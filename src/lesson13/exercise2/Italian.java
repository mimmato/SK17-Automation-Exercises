package lesson13.exercise2;

import java.text.ParseException;

public class Italian extends Person{
    public Italian(String EGN, String name, String sex, String religion, String languageSpoken, String job, String nationality, String countryOfResidence) throws ParseException {
        super(EGN, name, sex, religion, languageSpoken, job, nationality, countryOfResidence);
    }

    public boolean isItalian() {
        return "italian".equalsIgnoreCase(getNationality());
    }


    @Override
    public String getLanguageSpoken() {
        String languages = getNationality().toUpperCase();

        if ("italian".equalsIgnoreCase(languages)) {
            return "italian";
        } return "italian and " + languages;
    }

    @Override
    public String setCountryOfResidence(){
        return "Italy";
    }


}
