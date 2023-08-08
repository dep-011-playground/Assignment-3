

public class Table {
        String name = "isuru";
        int age = 15;
        String subject1 = "SE-1";
        String subject2 = "SE-2";
        String subject3 = "SE-3";
        double marks1 = 23;
        double marks2 = 89;
        double marks3 = 55;
    

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
