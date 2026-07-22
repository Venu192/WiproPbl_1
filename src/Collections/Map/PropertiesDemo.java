package Collections.Map;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties p = new Properties();

        p.put("Andhra Pradesh", "Amaravati");
        p.put("Telangana", "Hyderabad");
        p.put("Karnataka", "Bengaluru");
        p.put("Tamil Nadu", "Chennai");

        Set<Object> keys = p.keySet();

        Iterator<Object> it = keys.iterator();

        while (it.hasNext()) {

            Object key = it.next();

            System.out.println(key + " -> " + p.get(key));
        }
    }
}
