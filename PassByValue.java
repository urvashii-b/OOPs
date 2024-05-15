public class PassByValue {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before method call: " + num);
        modifyValue(num);
        System.out.println("After method call: " + num);
    }

    public static void modifyValue(int value) {
        value = 20; // Modifying the value
    }
}
