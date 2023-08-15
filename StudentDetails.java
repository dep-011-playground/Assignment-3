import java.util.Scanner;

public class StudentDetails {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // int n = Integer.valueOf("001");
        // System.out.println(n);

        final String COLOR_RED_BOLD = "\033[31;1m";
        final String RESET = "\033[30;0m";
        final String ERR_MSG = String.format("%s%s%s \n", COLOR_RED_BOLD, "%s", RESET);
        App:
        {
            System.out.print("Enter your name : ");
            String name = scanner.nextLine();

            if (name.length() == 0) {
                System.out.printf(ERR_MSG, "Invalid name");
                break App;
                
            } else if (name.strip().length() == 0) {
                System.out.printf(ERR_MSG, "Invalid name");
                break App;
            }

            System.out.println();
            System.out.print("Enter your age : ");
            int age = scanner.nextInt();
            if (age < 10 || age > 18 || Integer.toString(age).length() == 0) {
                System.out.printf(ERR_MSG, "Invalid age");
                break App;
            }

            scanner.nextLine();
            System.out.println();
            System.out.print("Enter your subject 1 : ");
            String subject1 = scanner.nextLine();
            if (!subject1.startsWith("SE-")) {
                System.out.printf(ERR_MSG, "Invalid Subject");
                break App;
            }

            subject1 = String.format("SE-%03d", Integer.valueOf(subject1.substring(3)));
            System.out.println(subject1);

            System.out.printf("Enter your %s marks : ", subject1);
            double subject1Marks = scanner.nextDouble();
            if (subject1Marks < 0 || subject1Marks > 100) {
                System.out.printf("\033[31mInvalid Marks\033[0m\n");
                break App;
            }

            scanner.nextLine();
            System.out.println();
            System.out.print("Enter your subject 2 : ");
            String subject2 = scanner.nextLine();
            if (!subject2.startsWith("SE-") || subject2.equals(subject1)) {
                System.out.printf("\033[31mInvalid Subject\033[0m\n");
                break App;
            }

            subject2 = String.format("SE-%03d", Integer.valueOf(subject2.substring(3, subject2.length())));
            System.out.println(subject2);

            System.out.printf("Enter your %s marks : ", subject2);
            double subject2Marks = scanner.nextDouble();
            if (subject2Marks < 0 || subject2Marks > 100) {
                System.out.printf("\033[31mInvalid Marks\033[0m\n");
                break App;
            }

            scanner.nextLine();
            System.out.println();
            System.out.print("Enter your subject 3 : ");
            String subject3 = scanner.nextLine();
            if (!subject3.startsWith("SE-") || subject3.equals(subject1) || subject3.equals(subject2)) {
                System.out.printf("\033[31mInvalid Subject\033[0m\n");
                break App;
            }

            subject3 = String.format("SE-%03d", Integer.valueOf(subject3.substring(3, subject3.length())));
            System.out.println(subject3);

            System.out.printf("Enter your %s marks : ", subject3);
            double subject3Marks = scanner.nextDouble();
            if (subject3Marks < 0 || subject3Marks > 100) {
                System.out.printf("\033[31mInvalid Marks\033[0m\n");
                break App;
            }

            System.out.println();
            System.out.printf("+%s+\n",
                    "----------------------------------------------------------------".substring(0, 50));
            System.out.printf("| Name : %-42s|\n", name.toUpperCase());
            String ageString = age + " years old";
            System.out.printf("| Age : %-43s|\n", ageString);
            // double total =
            // (double)((double)subject1Marks+(double)subject2Marks+(double)subject3Marks);
            double total = Double.sum(subject2Marks, subject3Marks);
            total = Double.sum(total, subject1Marks);
            Double avg = (double) (total / 3.0);
            String status;
            if (avg < 50) {
                status = "Fail";
                status = String.format("\033[31m%s\033[0m", status);
            } else if (avg < 75) {
                status = "Pass";
                status = String.format("\033[34m%s\033[0m", status);
            } else {
                status = "Creadit Pass";
                status = String.format("\033[32m%s\033[0m", status);
            }

            System.out.printf("| Status : %-49s|\n", status);
            System.out.printf("| Total : %-16.2f     Average : %-10.2f|\n", total, avg);

            String sub1Status;
            if (subject1Marks < 50) {
                sub1Status = "Fail";
                sub1Status = String.format("\033[31m%s\033[0m", sub1Status);
            } else if (subject1Marks < 75) {
                sub1Status = "Pass";
                sub1Status = String.format("\033[34m%s\033[0m", sub1Status);
            } else {
                sub1Status = "Creadit Pass";
                sub1Status = String.format("\033[32m%s\033[0m", sub1Status);
            }

            String sub2Status;
            if (subject2Marks < 50) {
                sub2Status = "Fail";
                sub2Status = String.format("\033[31m%s\033[0m", sub2Status);
            } else if (subject2Marks < 75) {
                sub2Status = "Pass";
                sub2Status = String.format("\033[34m%s\033[0m", sub2Status);
            } else {
                sub2Status = "Creadit Pass";
                sub2Status = String.format("\033[32m%s\033[0m", sub2Status);
            }
            String sub3Status;
            if (subject3Marks < 50) {
                sub3Status = "Fail";
                sub3Status = String.format("\033[31m%s\033[0m", sub3Status);
            } else if (subject3Marks < 75) {
                sub3Status = "Pass";
                sub3Status = String.format("\033[34m%s\033[0m", sub3Status);
            } else {
                sub3Status = "Creadit Pass";
                sub3Status = String.format("\033[32m%s\033[0m", sub3Status);
            }

            // sub1Status = String.format("\033[32m%s\033[0m", sub1Status);

            System.out.printf("+%s+\n",
                    "----------------------------------------------------------------".substring(0, 50));
            System.out.printf("|%7s      |%12s     |%14s    |\n", "Subject", "Marks", "Status");
            System.out.printf("+%s+\n",
                    "----------------------------------------------------------------".substring(0, 50));
            System.out.printf("|%9s    |%12.2f     |%23s    |\n", subject1, subject1Marks, sub1Status);
            System.out.printf("|%9s    |%12.2f     |%23s    |\n", subject2, subject2Marks, sub2Status);
            System.out.printf("|%9s    |%12.2f     |%23s    |\n", subject3, subject3Marks, sub3Status);
            System.out.printf("+%s+\n",
                    "----------------------------------------------------------------".substring(0, 50));
        }
    }
}