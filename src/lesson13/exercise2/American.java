package lesson13.exercise2;

import java.text.ParseException;

public class American extends Person{
    public American(String EGN, String name, String sex, String religion, String languageSpoken, String job, String nationality, String countryOfResidence) throws ParseException {
        super(EGN, name, sex, religion, languageSpoken, job, nationality, countryOfResidence);
    }

    public void isAmerican() {
        if (!("american".equalsIgnoreCase(getNationality()))) {
            System.out.println("You are NOT American!");
        } else {
            System.out.println("You are American");
        }
    }

    public String sayHello() {
        return "Hello";
    }

    @Override
    public String getLanguageSpoken() {
        if (isAmerican()){
            return "English" + " and " + getNationality();
        } else{
            return "English";
        }

    }


}
