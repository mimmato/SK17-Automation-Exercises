package lesson13.exercise2;

import java.text.ParseException;

public class Bulgarian extends Person {
    public Bulgarian(String EGN, String name, String sex, String religion, String languageSpoken, String job, String nationality, String countryOfResidence) throws ParseException {
        super(EGN, name, sex, religion, languageSpoken, job, nationality, countryOfResidence);
    }


    public boolean isBulgarian() {
        return "bulgarian".equalsIgnoreCase(getNationality());
    }

    String languages = getNationality().toUpperCase();

    @Override
    public String getLanguageSpoken() {

        if ("BULGARIAN".equalsIgnoreCase(languages)) {
            return "BULGARIAN";
        } return "BULGARIAN and " + languages;
    }

    public void sayHello() {
        boolean ifLangIsBulgarian = "BULGARIAN".equals(languages) || languages.contains("BULGARIAN");
        switch (languages) {
            case "BULGARIAN" -> System.out.println("Greeting in " + languages + " - Здравей!");
            case "ITALIAN" -> System.out.println("Greeting in " + languages + " - Ciao!");
            case "ENGLISH" -> System.out.println("Greeting in " + languages + " - Hello!");
            default -> System.out.println("Language " + languages + " is unknown - Hello!");
        }
        if (!ifLangIsBulgarian) {
            System.out.println("Greeting in BULGARIAN - Здравей!");
        }
    }
    @Override
    public String getCountryOfResidence(){
        return "Bulgaria".toUpperCase();
    }

}

