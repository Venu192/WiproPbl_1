package Collections.Map;

import java.util.*;

public class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            if (entry.getValue().equals(capitalName))
                return entry.getKey();
        }

        return null;
    }

    public HashMap<String, String> swapKyeValue() {

        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    public ArrayList<String> toArrayList() {

        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        CountryMap obj = new CountryMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("HashMap M1 : " + obj.M1);

        System.out.println("\nCapital of India : " + obj.getCapital("India"));

        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));

        System.out.println("\nSwapped Map M2 : " + obj.swapKyeValue());

        System.out.println("\nArrayList : " + obj.toArrayList());
    }
}
