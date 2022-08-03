package Four.five.homeWork.one;

import Four.four.homeWork.one.Contact;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PhoneBook {

    private Map<String, List<Contact>> groupContacts;


    public boolean addGroup(String groupName) {
        groupContacts.put(groupName, new ArrayList<>());
        return true;
    }

    public void addContact(Contact contact, String group) {
        groupContacts.get(group).add(contact);
    }

    public Contact findContact(String phoneNumber) {
        for (List<Contact> contacts : groupContacts.values()) {
            for (Contact contact : contacts) {
                if (contact.getPhoneNumber().equals(phoneNumber)) return contact;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        String showAll = "";
        showAll = showAll.concat("List of contacts:\n");
        for (String group : groupContacts.keySet()) {
            showAll = showAll.concat(group + ":\n");
            List<Contact> contacts = groupContacts.get(group);
            if (contacts.isEmpty()) {
                showAll = showAll.concat("\nEmpty!\n");
            } else {
                for (Contact contact : contacts) {
                    showAll = showAll.concat(contact + "\n");
                }
                showAll = showAll.concat("\n*****\n");
            }
        }
        return showAll;
    }

}
