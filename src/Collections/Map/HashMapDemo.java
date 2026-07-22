package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("101", "Sajid");
        map.put("102", "Rahul");
        map.put("103", "Anitha");

        System.out.println("Key 101 exists : " + map.containsKey("101"));

        System.out.println("Value Rahul exists : " + map.containsValue("Rahul"));

        System.out.println("\nUsing Iterator");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, String> entry = it.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
