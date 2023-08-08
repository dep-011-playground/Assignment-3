import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Demo1{
    private static final Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.println();

        scanner.nextLine();
        System.out.print("Enter Subject 1: ");
        String subject1 = scanner.nextLine();
        if(!subject1.startsWith("SE-")){
            System.out.println("Invalied Subject Name");
            assert false;
        }
        
        System.out.printf("Enter %s Marks: ", subject1);
        int marks1 = scanner.nextInt();
        if (marks1<0 || marks1>100) {
            System.out.println("Invalied Marks");
            assert false;
        }

        scanner.nextLine();
        System.out.print("Enter Subject 2: ");
        String subject2 = scanner.nextLine();
        if(!subject2.startsWith("SE-")){
            System.out.println("Invalied Subject Name");
            assert false;
        }

        System.out.printf("Enter %s Marks: ", subject2);
        int marks2 = scanner.nextInt();
        if (marks2<0 || marks2>100) {
            System.out.println("Invalied Marks");
            assert false;
        }

        scanner.nextLine();
        System.out.print("Enter Subject 3: ");
        String subject3 = scanner.nextLine();
        if(!subject3.startsWith("SE-")){
            System.out.println("Invalied Subject Name");
            assert false;
        }

        System.out.printf("Enter %s Marks: ", subject3);
        int marks3 = scanner.nextInt();
        if (marks3<0 || marks3>100) {
            System.out.println("Invalied Marks");
            assert false;
        }
    int total = marks1 + marks2 + marks3;
    int avg = total/3;
    String status = "";
    if (avg > 75) {
        status = "Credit Pass";
    }else if (avg>55){
        status = "Pass";
    }else {
       status= "Fail";
    }

    String status1 = "";
    if (marks1 > 75) {
        status1 = "Credit Pass";
    }else if (marks1>55){
        status1 = "Pass";
    }else {
       status1= "Fail";
    }

     String status2 = "";
    if (marks2 > 75) {
        status1 = "Credit Pass";
    }else if (marks2>55){
        status2 = "Pass";
    }else {
       status2= "Fail";
    }

     String status3 = "";
    if (marks3 > 75) {
        status1 = "Credit Pass";
    }else if (marks3>55){
        status3 = "Pass";
    }else {
       status3= "Fail";
    }

    System.out.println("+-------------------------------------+");
    System.out.printf("| Name    : %s \n", name);
    System.out.printf("| Age     : %s \n",age);
    
    
    System.out.printf("| Status  : %s \n", status);
    System.out.printf("| Total   : "+ total + "     Avg   :" + avg +"\n");

    System.out.println("+------------+------------+------------+");
    System.out.println("|  SUBJECT   |   MARKS    |   STATUS   |");
    System.out.println("+------------+------------+------------+");
    System.out.printf("|  %6s   |   %s    |   %s   |\n", subject1, marks1, status1);
    System.out.println("+------------+------------+------------+");
    System.out.printf("|  %s   |   %s    |   %s   |\n", subject2, marks2, status2);
    System.out.println("+------------+------------+------------+");
    System.out.printf("|  %s   |   %s    |   %s   |\n", subject1, marks1, status2);
    System.out.println("+------------+------------+------------+");

    }

}