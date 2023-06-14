package RegEx;

public class RegEx_Main {
    /**

     #RegEx :
        The Regular Expression is a single string used to represent another string or a set of particular strings!

     #The RegEx speed depends on many factors :
        1- The problem u tyrnna solve!
        2- The engine u making use of!
        3- The pattern of RegEx u wrote!

     #A RegEx pattern that needs some seconds to be processed by Java or python, can take up to minutes if written wrong!

     */

    public static void main(String[] args) {

        String regex = "Salute SpongeBob and Patrick";
        System.out.println(regex.matches("^[a-zA-Z]{6}\s(.*)\s(.*)\s([a-zA-Z]{7})"));
    }
}
