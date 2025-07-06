package emailapp;

import java.util.Scanner;

public class Email {
    private String email;

    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to initialize the email object with first name and last name
    public Email(String firstNameString, String lastNameString) {
        this.firstName = firstNameString;
        this.lastName = lastNameString;
        System.out.println("Email Create " + this.firstName + " " + this.lastName);

        // Call method asking for the department and the set the department
        this.department = setDepartment();
        // System.out.print(this.department);

        // Call a method to generate random password
        this.password = randomPassword(this.defaultPasswordLength);
        // System.out.print(this.password);

        //Combine elements to generate email
        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department
                + "cloud.com";
        System.out.print(this.email);
    }

    // Ask the user for department choice
    private String setDepartment() {
        System.out.print(
                "Department Code\n 1 for sales\n 2 for development\n 3 for accounting\n 0 for none\n Enter the department code: ");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();
        if (depChoice == 1) {
            scanner.close();
            return "sales";
        } else if (depChoice == 2) {
            scanner.close();
            return "dev";
        } else if (depChoice == 3) {
            scanner.close();
            return "act";
        } else {
            scanner.close();
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMONPQRSTUVWXYZ0123456789@#$%&";
        char[] pass = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            pass[i] = passwordSet.charAt(random);
        }
        return new String(pass);
    }

    // Set mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change password
    public void setEmailPassword(String newPassword) {
        this.password = newPassword;
    }

    //Getters
    public int getMailBoxCapacity() { return this.mailboxCapacity; }
    public int getAlternateEmail() { return this.alternateEmail; }

    public int getPassword() {
        return this.password;
    }
    
    //Display information 
}
