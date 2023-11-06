package de.neuefische;

public class Main {

    static String inputPassword = "Passwords";

    public static void main(String[] args) {

    }

    /* Methode zur Überprüfung der Länge:
    - Name: paswordLength
    - returnt einen boolean - je nachdem, ob das Passwort lang genug ist oder nicht
    - empfängt das Passwort (String) als Parameter

    */

    public static boolean passwordLength(String input) {
        return inputPassword.length() >= 8;
    }

    /*
     Methode zur Überprüfung, ob Ziffern enthalten sind:
    - Name: numbersIncluded
    - returnt einen boolean, je nachdem, ob Nummern enthalten sind oder nicht
    - empfängt das Passwort (String) als Parameter
    */

    public static boolean numbersIncluded(String input) {
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (String number : numbers) {
            if (input.contains(number)) {
                return true;
            } else {
                return true;
            }
        }
        return false;
    }

    /*

    Methode zur Überprüfung auf Groß- und Kleinbuchstaben
    - Name: UpperLowerCaseIncluded
    - returnt einen boolean, je nachdem, ob Groß- und Kleinschreibung verwendet wurde
    - empfängt das Passwort (String) als Parameter

    */
    public static boolean upperLowercaseIncluded(String input) {
        boolean containsUppercase = false;
        boolean containsLowercase = false;

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                containsUppercase = true;
            } else if (Character.isLowerCase(c)) {
                containsLowercase = true;
            }
            if (containsUppercase && containsLowercase) {
                return true;
            }
        }
        return containsUppercase && containsLowercase;
    }



    public static boolean checkForUnsafePasswords(String input) {
        String[] unsafePasswords = {"Password", "password", "12345678"};
        for (String word : unsafePasswords) {
            if (word.equals(input)) {
                return false;
            }
        }
        return true;
    }


        /*

    Methode zur Erkennung, ob Das PW Sonderzeichen enthält
    - Name: checkForSpecialCharacter
    - returnt einen boolean, je nachdem, ob Sonderzeichen enthalten sind
    - empfängt das Passwort (String) als Parameter

     */



}




