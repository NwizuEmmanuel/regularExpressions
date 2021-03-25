/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpressions;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class option{
    public static void mthOption(){
        System.out.println("Your Registration number is incorrect.\nOr something went wrong");
        System.out.println("Choose one: \n1. Try again\n2. Forgot");
        Scanner myScanner = new Scanner(System.in);
        String objScanner = myScanner.nextLine();// user inputs something here in accordance to the instruction given above
        switch(objScanner){
            case "1":
                // when input is 1
                RegularExp2.regexCheckers();
                break;
            case "2":
                // when input is 2
                System.out.println("Ask ur form teacher");
                break;
            default:
                //when input is nothing or something apart from 1 and 2
                System.out.println("Something went wrong");
        }
    }
}
