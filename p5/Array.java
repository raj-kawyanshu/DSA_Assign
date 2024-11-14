import java.util.ArrayList;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(0,"Mazda");
        System.out.println(cars);
        System.out.println(cars.get(2));
        cars.set(0,"Opel");
        System.out.println(cars);
        cars.remove(0);           // All these methodes are the inplace methods in the ArrayList, and other methond
        System.out.println(cars);
        // cars.clear();
        System.out.println(cars);
        System.out.println(cars.size());
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
          }
        for (String i : cars) {
        System.out.println(i);
        }
        Collections.sort(cars);
        for(String car: cars)
        {
            System.out.print(car+"\t");
        }

 


    }
}




// Sort an ArrayList
// Another useful class in the java.util package is the Collections