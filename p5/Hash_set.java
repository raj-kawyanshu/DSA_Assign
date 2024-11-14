import java.util.HashSet;
// It is the similar to the set in the python 



public class Hash_set {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.contains("BMW"));
        cars.remove("Volvo");
        cars.size();
        for( String i : cars)
        {
            System.out.println(i);
        }
        cars.clear();
    }
}
