package Collections.Set;

import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> T1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {

        T1.add(countryName);
        return T1;
    }

    public String getCountry(String countryName) {

        for (String country : T1) {

            if (country.equals(countryName))
                return country;
        }

        return null;
    }

    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println(obj.T1);

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("Canada"));
    }
}
