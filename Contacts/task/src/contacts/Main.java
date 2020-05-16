package contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("Enter action (add, remove, edit, count, list, exit):");
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                break;
            } else if (command.equals("add")) {
                Contact contact = new Contact();

                System.out.println("Enter the name:");
                contact.setName(scanner.nextLine());

                System.out.println("Enter the surname:");
                contact.setSurName(scanner.nextLine());

                System.out.println("Enter the number:");
                contact.setPhoneNumber(scanner.nextLine());

                phoneBook.getContacts().add(contact);

                System.out.println("The record added.");

            } else if (command.equals("remove")) {
                if (phoneBook.getContacts().size() == 0) {
                    System.out.println("No records to remove!");
                } else {
                    listBook(phoneBook);
                    System.out.println("Select a record:");
                    int number = Integer.parseInt(scanner.nextLine());
                    phoneBook.getContacts().remove(number - 1);
                    System.out.println("The record removed!");
                }

            } else if (command.equals("edit")) {
                if (phoneBook.getContacts().size() == 0) {
                    System.out.println("No records to edit!");
                } else {
                    listBook(phoneBook);
                    System.out.println("Select a record:");
                    int number = Integer.parseInt(scanner.nextLine());
                    System.out.println("Select a field (name, surname, number):");
                    String fildName = scanner.nextLine();
                    Contact contact = phoneBook.getContacts().get(number - 1);
                    if (fildName.equals("name")) {
                        System.out.println("Enter the name:");
                        contact.setName(scanner.nextLine());
                    } else if (fildName.equals("surname")) {
                        System.out.println("Enter the surname:");
                        contact.setSurName(scanner.nextLine());
                    } else if (fildName.equals("number")) {
                        System.out.println("Enter number:");
                        contact.setPhoneNumber(scanner.nextLine());
                    }
                    System.out.println("The record updated!");
                }

            } else if (command.equals("count")) {
                System.out.println("The Phone Book has " + phoneBook.getContacts().size() + " records.");
            } else if (command.equals("list")) {
                listBook(phoneBook);
            }
        }
    }

    private static void listBook(PhoneBook phoneBook) {
        int count = 0;
        for (Contact contact : phoneBook.getContacts()) {
            System.out.println(++count + ". " + contact);
        }
    }
}
