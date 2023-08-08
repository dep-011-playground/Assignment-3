import java.util.Scanner;

import javax.security.auth.Subject;

public class Assignment3 {
    private static final Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {

        final String COLOUR_RED_BOLD = "\033[31;1m";
        final String RESET = "\033[30;0m" ;

        String name;
        int age;
        String subject1;
        String subject2;
        String subject3 ="";
        double marks1;
        double marks2;
        double marks3;

        final String ERROR_MSG = String
                                .format("%s%s%s \n", COLOUR_RED_BOLD, "%s", RESET);

        app:{

            System.out.println("Enter Your Name: ");
            name = scanner.nextLine().strip();

            if (name.length() == 0){
                //System.out.printf("%s Name can't be empty %s\n", COLOUR_RED_BOLD, RESET);
                System.out.printf(ERROR_MSG, "Name can't be empty");
                break app;
            }

            System.out.println("Enter Your Age: ");
            age = scanner.nextInt();
            scanner.nextLine();
            //scanner.skip(System.lineSeparator());

            if (age < 10 || age >18){
                System.out.printf("%sInvalied Age %s \n", COLOUR_RED_BOLD, RESET);
                break app;
            }

            System.out.println("Enter subject 1: ");
            subject1 = scanner.nextLine().strip();

            if (subject1.isBlank()){
                System.out.printf(ERROR_MSG, "Subject 1 can't be empty");
                break app;
            } else if (!subject1.startsWith("SE-")){
                System.out.printf(ERROR_MSG, "Invalied Subject 1");
                break app;
            }

            System.out.printf("Enter marks for %s: ", subject1);
            marks1 = scanner.nextDouble();
            scanner.nextLine();

            if (marks1 <0 || marks1>100){
                System.out.printf(ERROR_MSG, "Invalied Marks");
                break app;
            }


            System.out.println("Enter subject 2: ");
            subject2 = scanner.nextLine().strip();

            if (subject2.isBlank()){
                System.out.printf(ERROR_MSG, "Subject 2 can't be empty");
                break app;
            } else if (!subject1.startsWith("SE-")){
                System.out.printf(ERROR_MSG, "Invalied Subject 2");
                break app;
            } else if (subject2.equals(subject1)){
                System.out.printf(ERROR_MSG, "Invalied subject 2, Subject already exists");
                break app;
            }

            System.out.printf("Enter marks for %s: ", subject2);
            marks2 = scanner.nextDouble();
            scanner.nextLine();

            if (marks2 <0 || marks2>100){
                System.out.printf(ERROR_MSG, "Invalied Marks");
                break app;
            }

            System.out.println("Enter subject 3: ");
            subject1 = scanner.nextLine().strip();

            if (subject3.isBlank()){
                System.out.printf(ERROR_MSG, "Subject 3 can't be empty");
                break app;
            } else if (!subject3.startsWith("SE-")){
                System.out.printf(ERROR_MSG, "Invalied Subject 1");
                break app;
            }

            System.out.printf("Enter marks for %s: ", subject3);
            marks3 = scanner.nextDouble();
            scanner.nextLine();

            if (marks3 <0 || marks3>100){
                System.out.printf(ERROR_MSG, "Invalied Marks");
                break app;
            }


            String status;
            String subject1Status;
            String subject2Status;
            /**
             *
             */
            String subject3Status;
    
            // Determine the overall status
            if (avg>=75) status = "DP";
            else if (avg >= 65) status = "CP";
            else if (avg >=55) status = "P";
            else status = "F";
    
            if (marks1>=75) subject1status = "DP";
            else if (avg >= 65) subject1Status = "CP";
            else if (avg >=55) subject1Status  = "P";
            else subject1Status  = "F";
    
            if (marks2>=75) subject2status = "DP";
            else if (avg >= 65) subject2Status = "CP";
            else if (avg >=55) subject2Status  = "P";
            else subject2Status  = "F";
    
            if (marks3>=75) subject3status = "DP";
            else if (avg >= 65) subject3Status = "CP";
            else if (avg >=55) subject3Status  = "P";
            else subject3Status  = "F";
    
            subject1 = String.format("SE-%03d", Integer.valueOf(subject1.substring(3)));
            subject2 = String.format("SE-%03d", Integer.valueOf(subject2.substring(3)));
            subject3 = String.format("SE-%03d", Integer.valueOf(subject3.substring(3)));
    
    
    
    
            
            //generate the table
    
            System.out.println("+".concat("-".repeat(40)).concat("+"));
            System.out.println("|%10s: %-28s|\n", "Name", name.toUppercase());
            System.out.println("|%10s: %-28s|\n", "Age", name.toUppercase());
            System.out.println();
    
    
    
    }




        }
    }
    
} 
