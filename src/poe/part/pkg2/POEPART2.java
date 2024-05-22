package poe.part.pkg2;
import java.util.Scanner;
public class POEPART2 
{

    public static void main(String[] args)
    {
        Scanner m = new Scanner(System.in);
        String firstname, lastname, username, password;
        boolean CUN, CPC, CP, cpc;
        Class3 cs3 = new Class3();

        System.out.print("Enter  first name :");
        firstname = m.next();

        System.out.print("Enter  last name : ");
        lastname = m.next();

        System.out.print("Enter username : ");
        username = m.next();

        CUN = cs3.CheckUserName(username);
        if (CUN == true) {
            System.out.print("Username successfully captured \n");
            username = m.next();
        } else {
            System.out.print(" \n");
            username = m.next();
        }

        System.out.print("Enter password : ");
        password = m.next();

        CPC = cs3.CheckPasswordComplexity(password);
        if (CPC == true) {
            System.out.print("Password successfully captured : ");
            password = m.next();
        } else {
            System.out.print("Password is not correctly formatted,please ensure that the password contains \n atleast 8 characters, a capital letter,a number and a special character");
            password = m.next();
        }

        CP = cs3.CheckPassword(password);
        if (CP == true) {
            System.out.print("Password successfully captured : ");
            password = m.next();
        } else {
            System.out.print("Password is not correctly formatted,please ensure that the password contains \n atleast 8 characters, a capital letter,a number and a special character");
            password = m.next();
        }

        cpc = cs3.checkpasswordcomplexity(password);
        if (cpc == true) {
            System.out.print(" \n Password successfully captured");
            password = m.next();
        } else {
            System.out.print("Password is not correctly formatted,please ensure that the password contains \n atleast 8 characters, a capital letter,a number and a special character");
            password = m.next();
        }
        if ((username.equals("Jay_")) && (password.equals("Evans#50"))) {
            System.out.print("Welcome Jay_, it is great to see you again");
        } else {
            System.out.print("Username or password incorrect,please try again");
        }

        String enteredUsername = "Mihle_Sindesi";
        String enteredPassword = "Mihle*123";
        boolean LoginUser = login(enteredUsername, enteredPassword);
        boolean isLoggedIn = false;
        if (isLoggedIn) {
            System.out.println("User logged in successfully!");
        } else {
            System.out.println("Username or password incorrect");
        }

    }

    private static boolean login(String enteredUsername, String enteredPassword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
  
    
    

