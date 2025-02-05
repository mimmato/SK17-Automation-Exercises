package lesson13.exercise2;

import java.text.ParseException;

public class Child extends Person{

    public Child(String EGN, String name, String sex, String religion, String languageSpoken, String job, String nationality, String countryOfResidence) throws ParseException {
        super(EGN, name, sex, religion, languageSpoken, job, nationality, countryOfResidence);

    }

    public void isChild(){
        if (this.getAge() < 27){
            System.out.println("You are a child!");
        } else{
            System.out.println("You are not a child!");
        }
    }

    @Override
    public String getJob() {
        return "This child is jobless!";
    }

    @Override
    public String canTakeLoan() {
       return "Your child is unemployed and cannot take a loan, legally.";
    }

}
