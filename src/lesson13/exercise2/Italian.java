package lesson13.exercise2;

import java.text.ParseException;

public class Italian extends Person{
    public Italian(String EGN, String name, String sex, String religion, String languageSpoken, String job, String nationality, String countryOfResidence) throws ParseException {
        super(EGN, name, sex, religion, languageSpoken, job, nationality, countryOfResidence);
    }

    public boolean isItalian() {
        return "italian".equalsIgnoreCase(getNationality());
    }

    String languages = getNationality().toUpperCase();

    @Override
    public String getLanguageSpoken() {

        if ("italian".equalsIgnoreCase(languages)) {
            return "italian";
        } return "italian and " + languages;
    }

    @Override
    public String getCountryOfResidence(){
        return "Italy";
    }

    @Override
    public void sayHello() {
        boolean ifLangIsItalian = "ITALIAN".equals(languages) || languages.contains("ITALIAN");
        switch (languages) {
            case "BULGARIAN" -> System.out.println("Greeting in " + languages + " - Здравей!");
            case "ITALIAN" -> System.out.println("Greeting in " + languages + " - Ciao!");
            case "ENGLISH" -> System.out.println("Greeting in " + languages + " - Hello!");
            default -> System.out.println("Language " + languages + " is unknown - Hello!");
        }
        if (!ifLangIsItalian) {
            System.out.println("Greeting in ITALIAN - Ciao!");
        }
    }

}
