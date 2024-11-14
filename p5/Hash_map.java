import java.util.HashMap;


public class Hash_map {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        // HashMap is similar to the dicsonary in python stored data in keyvalue pair 
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.remove("England"));
        System.out.println(capitalCities.size());


        // Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:




    }  
}
