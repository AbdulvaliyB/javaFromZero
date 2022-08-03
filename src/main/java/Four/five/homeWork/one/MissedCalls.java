package Four.five.homeWork.one;

import Four.four.homeWork.one.Contact;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    private Map<LocalDateTime, String> map = new TreeMap<>();

    public void add(LocalDateTime time, String phone) {
        map.put(time, phone);
    }

    public void add(String phone) {
        add(LocalDateTime.now(), phone);
    }

    public void clear() {
        map.clear();
    }

    public String toString(PhoneBook phoneBook) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Missed calls:\n");

        for (Map.Entry<LocalDateTime, String> timeAndPhoneNumber : map.entrySet()) {
            LocalDateTime time = timeAndPhoneNumber.getKey();
            String phoneNumber = timeAndPhoneNumber.getValue();
            Contact contact = phoneBook.findContact(phoneNumber);
            if (contact == null) {
                stringBuilder.append("\t" + time + ":" + phoneNumber + "\n");
            } else {
                stringBuilder.append("\t" + time + ":" + contact + "\n");
            }
        }

        return stringBuilder.toString();
    }

}
