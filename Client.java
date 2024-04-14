import java.rmi.*;
import java.util.Scanner;

public class Client{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            String serverURL = "rmi://localhost/Server";
            ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverURL);

            System.out.print("Enter 1st num: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter 2st num: ");
            double num2 = sc.nextDouble();

            System.out.println("1st num is: " + num1);
            System.out.println("2st num is: " + num2);

            System.out.println("--------Results--------");
            System.out.println("Addition IS: " +serverIntf.Addition(num1, num2));
            System.out.println("Subtraction IS: " +serverIntf.Subtraction(num1, num2));
            System.out.println("Multiplication IS: " +serverIntf.Multiplication(num1, num2));
            System.out.println("Division IS: " +serverIntf.Division(num1, num2));



        }
        catch(Exception e){
            System.out.println("Exception Occurred At Client!"+ e.getMessage());
        }
    }
}