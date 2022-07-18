package phoneBook;

import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {

        PhoneBook[] contactLists = new PhoneBook[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println(contactLists.length);
        for (int i = 1; i<contactLists.length;i++){
            System.out.println("Enter your name:  ");
            String name = scanner.nextLine();

            System.out.println("Enter your address:  ");
            String address = scanner.nextLine();

            System.out.println("Enter your phone number:  ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Enter your Email address:  ");
            String email = scanner.nextLine();


            PhoneBook phoneBook = new PhoneBook();

            phoneBook.setName(name);
            phoneBook.setAddress(address);
            phoneBook.setPhoneNumber(phoneNumber);
            phoneBook.setEmail(email);

            for (int k =1; k<contactLists.length; k++){

                contactLists[k] = phoneBook;
            }
        }

        for(int i = 1; i < contactLists.length; i++){
            PhoneBook phoneBook = contactLists[i];
            System.out.println("This is for user "+i);

            System.out.println("Name " + phoneBook.getName());
            System.out.println("Address " + phoneBook.getName());
            System.out.println("Phone number " + phoneBook.getName());
            System.out.println("Email " + phoneBook.getName());

            System.out.println();
        }



    }
}
