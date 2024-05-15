public class PassByReference{
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println("Before method call: " + str);
        modifyString(str);
        System.out.println("After method call: " + str);
    }

    public static void modifyString(StringBuilder str) {
        str.append(" World!"); // Modifying the StringBuilder object
    }
}
