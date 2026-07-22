package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Sajid", 987654321);
        contacts.put("Rahul", 987654322);
        contacts.put("Anitha", 987654323);
        contacts.put("Suman", 987654324);

        System.out.println("Key Exists (Rahul): " + contacts.containsKey("Rahul"));

        System.out.println("Value Exists (987654323): " + contacts.containsValue(987654323));

        System.out.println("\nContact List");

        Iterator<Map.Entry<String, Integer>> it = contacts.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, Integer> entry = it.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
