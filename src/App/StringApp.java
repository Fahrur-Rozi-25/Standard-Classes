package App;

import Classes.ClassString;

public class StringApp {
    public static void main(String[] args) {
        ClassString string = new ClassString("Say");

        String Name = "Fahrur Rozi Nur Aziz";
        String lowerCase = Name.toLowerCase();
        String upperCase = Name.toUpperCase();

        System.out.println(Name);
        System.out.println(lowerCase);
        System.out.println(upperCase);



    }
}
