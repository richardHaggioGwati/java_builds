package emailapp;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Name: ");
        String firstName = scanner.next();
        System.out.print("First Name: ");
        String lastName = scanner.next();
        Email email = new Email(firstName, lastName);
        scanner.close();
    }
}
