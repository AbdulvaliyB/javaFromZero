package Four.five.homeWork.one;

import Four.four.homeWork.one.Contact;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setGroupContacts(new HashMap<>());

        Contact contact1 = new Contact("Petya", "111");
        Contact contact2 = new Contact("Vanya", "222");
        Contact contact3 = new Contact("Masha", "333");

        phoneBook.addGroup("Friends");
        phoneBook.addGroup("Family");
        phoneBook.addContact(contact1, "Friends");
        phoneBook.addContact(contact2, "Friends");
        phoneBook.addContact(contact1, "Family");
        phoneBook.addContact(contact3, "Family");

        MissedCalls calls = new MissedCalls();

        calls.add("111");
        calls.add("555");
        System.out.println(calls.toString(phoneBook));

    }
}
