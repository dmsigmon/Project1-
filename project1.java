import java.util.Scanner;

public class project1 {

    public static void main(String[] args) {
        //Getting user Input
        Scanner in = new Scanner(System.in);

        System.out.println("Type your First Name: ");
        String firstName = in.nextLine();
        System.out.println("First Name: " + firstName);

        System.out.println("Type your Last Name: ");
        String lastName = in.nextLine();
        System.out.println("last Name:" + lastName);

        System.out.println("Is Your Gender M or F?");
        String gender = in.nextLine();
        System.out.println("Gender: " + gender);

        System.out.println("What is Your Birthday?(MM/DD/YYY)");
        String birthDate = in.nextLine();
        System.out.println("Birth Date: " + birthDate);

        System.out.println("How old are you?");
        String age = in.nextLine();
        System.out.println("Age: " + age);

        System.out.println("What is your Phone Number?(###-###-####)");
        String phoneNum = in.nextLine();
        System.out.println("Phone Number: " + phoneNum);

        System.out.println("What is your GPA? (X.XX)");
        String gpa = in.nextLine();
        System.out.println("GPA: " + gpa);


        // Convert age into months,days, hours, minutes, and seconds
        //Creating result variable in order to change age from a string into an integer.

        int result = Integer.parseInt(age);
        int months = result * 12;
        int weeks = result * 52;
        int days = result * 365;
        long hours = days * 24;
        long minutes = hours * 60;
        long seconds = minutes * 60;

        //printing statement

        System.out.println("Wow " + firstName + "! " + "you are " + age + " years old, " + "that is " + months + " months, or " + weeks + " weeks, or " + days + " days, or " + hours + " hours, or " + minutes + " minutes, or " + seconds + " seconds!");

        // Creating password by using indexes at each string
        var password1 = firstName.charAt(0);
        var password2 = lastName.charAt(0);
        var password3 = gender.charAt(0);
        var password4 = birthDate.charAt(0);
        var password5 = age.charAt(0);
        var password6 = phoneNum.charAt(0);
        var password7 = gpa.charAt(0);

        // Printing out the password
        System.out.println("Password: " + password1 + password2 + password3 + password4 + password5 + password6 + password7);

    }
}
