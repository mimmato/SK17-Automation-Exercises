package lesson13.exercise2;

import java.text.ParseException;

public class American extends Person{
    public American(String EGN, String name, String sex, String religion, String languageSpoken, String job, String nationality, String countryOfResidence) throws ParseException {
        super(EGN, name, sex, religion, languageSpoken, job, nationality, countryOfResidence);
    }

    public boolean isAmerican() {
        return "american".equalsIgnoreCase(getNationality());
    }

    String languages = getNationality().toUpperCase();

    @Override
    public String getLanguageSpoken() {

        if ("ENGLISH".equalsIgnoreCase(languages)) {
            return "ENGLISH";
        } return "ENGLISH and " + languages;
    }
    @Override
    public void sayHello() {
        boolean ifLangIsEnglish = "ENGLISH".equals(languages) || languages.contains("ENGLISH");
        switch (languages) {
            case "BULGARIAN" -> System.out.println("Greeting in " + languages + " - Здравей!");
            case "ITALIAN" -> System.out.println("Greeting in " + languages + " - Ciao!");
            case "ENGLISH" -> System.out.println("Greeting in " + languages + " - Hello!");
            default -> System.out.println("Language " + languages + " is unknown - Hello!");
        }
        if (!ifLangIsEnglish) {
            System.out.println("Greeting in ENGLISH - Hello!");
        }
    }

    @Override
    public String getCountryOfResidence(){
        return "USA";

}

}

