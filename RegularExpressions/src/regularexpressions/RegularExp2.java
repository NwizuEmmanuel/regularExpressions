/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpressions;
import java.util.regex.*;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class RegularExp2 {
    //static String userInputTab;
    public static void regexCheckers(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter ur Registration number: ");
        String userInputTab = myScanner.nextLine();// user inputs registration number
        // Sample AMC/2014/0023
        // user input must match the below pattern
        // user input must start with AMC, the year must start with 20 and any two numbers lastly reg no ends with 4 any digits
        //Each section must be separated by forward slash /
        Pattern pattern = Pattern.compile("[AMC]+{3}[/][2][0][0-9]+{2}[/][0-9]+{4}");
        Matcher matcher = pattern.matcher(userInputTab);
        // here if user input matches the pattern explained above
        // this program displays "Registration number correct"
        if (matcher.matches()) {
            System.out.println("Registration number correct");
        }else{
            // here if user's input don't matches the pattern this program executed the option class
            option.mthOption();
        }
    }
}
