public class Method {
    public static void main(String[] args) {
        // Example of instance methods
        SampleInstance obj1 = new SampleInstance();
        obj1.setName("Ramu");
        System.out.println(obj1.getName());

        // Example of static methods
        SampleStatic.setName("Abhiram");
        System.out.println(SampleStatic.name);

        // Accessing the static method and field using object
        SampleStatic obj2 = new SampleStatic();
        obj2.setName("Manish");
        System.out.println(obj2.name);
    }
}

// Class to demonstrate instance methods
class SampleInstance {
    String name = "";

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }
}

// Class to demonstrate static methods
class SampleStatic {
    public static String name = "";

    public static void setName(String s) {
        name = s;
    }
}
