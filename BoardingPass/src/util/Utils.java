package util;

import person.Person;
import java.util.Scanner;

public class Utils {
    // This is a simple utility class that will allow for various necessary
    // code interactions
        public Utils(){
            System.out.println("You did not mean to instantiate this did you ?");
        }

        public static String getInput(){
            Scanner scanner = new Scanner(System.in);
            String outString = "";
            try{
                outString = scanner.next();
            } catch (Exception err){
                System.out.println(err.getMessage());
                System.out.println("Something went wrong");
            }
            return outString;
        }

        public static void printCustomer(Person person){
            System.out.println("\t -Customer Information-");
            System.out.println("\t ----------------------");
            System.out.println("\t  Name: "+person.getName());
            System.out.println("\t  Phone: "+person.getPhoneNumber());
            System.out.println("\t  Email: "+person.getEmail());
            System.out.println("\t  Age: "+person.getAge());
            System.out.println("\t  Gender: "+person.getSex());
        }
    }
