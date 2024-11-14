public class Wrapper {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDou = 233.33;
        Character myCharacter = 'a';
        System.out.println(myInt + myCharacter + myDou);
        System.out.println(myInt.toString());
        System.out.println(myDou.toString().length());

    }
}



// Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
// the following methods are used to get the value associated with the corresponding wrapper object: intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
// Another useful method is the toString() method, which is used to convert wrapper objects to strings.
