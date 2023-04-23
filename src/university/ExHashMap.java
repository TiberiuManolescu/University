package university;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class ExHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hmCountry = new HashMap<>();

        hmCountry.put("ES", "Spain");
        hmCountry.put("FR", "France");
        hmCountry.put("IT", "Italy");
        hmCountry.put("DE", "Germany");
        hmCountry.put("NL", "Netherlands");
        hmCountry.put("BE", "Belgium");
        hmCountry.put("PT", "Portugal");
        hmCountry.put("AT", "Austria");
        hmCountry.put("CH", "Switzerland");
        hmCountry.put("SE", "Sweden");

        hmCountry.remove("GB");

        Set<String> keySet = hmCountry.keySet();

        ArrayList<String> sortedKeys = new ArrayList<>(keySet);
        Collections.sort(sortedKeys);


        for (String countryCode : sortedKeys) {
            System.out.println(countryCode);
        }
    }
}
