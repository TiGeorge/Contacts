package contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the person:");
        String name = scanner.nextLine();

        System.out.println("Enter the surname of the person:");
        String surName = scanner.nextLine();

        System.out.println("Enter the number:");
        String number = scanner.nextLine();

        Contact contact = new Contact(name, surName, number);
        System.out.println("A record created!");

        PhoneBook phoneBook = new PhoneBook(contact);
        System.out.println("A Phone Book with a single record created!");
    }
}