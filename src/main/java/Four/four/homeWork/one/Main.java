package Four.four.homeWork.one;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Contact> contactList = new HashMap<>();
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setGroupContacts(new HashMap<>());

        while (true) {
            System.out.println("Lets create contacts!");
            System.out.print("Enter name of contact: ");
            String contactName = scanner.nextLine();
            if (contactName.equals("0")) break;
            System.out.print("Enter phone number of contact: ");
            String contactNumber = scanner.nextLine();
            contactList.put(contactNumber, new Contact(contactName, contactNumber));
        }
        while (true) {
            System.out.println("\nLets create groups");
            System.out.print("Enter name of group: ");
            String groupName = scanner.nextLine();
            if (groupName.equals("0")) break;
            phoneBook.addGroup(groupName);
        }
        while (true) {
            boolean check=true;
            System.out.println("\nLets add contacts to the groups");
            System.out.print("Enter phone number of the contact : ");
            String contactNumber = scanner.nextLine();
            if (contactNumber.equals("0")) break;
//            if (contactList.get(contactNumber)!=null) System.out.println("There is no such contact!\n");
            try{
                Contact contact = contactList.get(contactNumber);
                System.out.println(contact);
            }catch (Exception e){
                System.out.println("There is no such contact!\n");
                check=false;
            }
                while (check) {
                    System.out.print("Enter the name of the group");
                    String groupName = scanner.nextLine();
                    if (groupName.equals("0")) break;
                    phoneBook.addContact(contactList.get(contactNumber), groupName);

            }

        }
        System.out.println(phoneBook);
//
//        Contact contact1 = new Contact("Petya", "+998971670555");
//        Contact contact2 = new Contact("Vanya", "+998997200855");
//
//        phoneBook.addGroup("Friends");
//        phoneBook.addContact(contact1, "Friends");
//        phoneBook.addContact(contact2, "Friends");
//
//        System.out.println(phoneBook);

    }
}
