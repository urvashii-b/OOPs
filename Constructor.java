// Constructor - used to initialize the object's state or perform setup tasks.

public class Constructor {
    private String name;
    private int age;
    private double GPA;

    // Default constructor
    public Constructor() {
        // Assign default values to instance variables
        this.name = "";
        this.age = 0;
        this.GPA = 0.0;
    }

    // Parameterized constructor
    public Constructor(String name, int age, double GPA) {
        // Initialize fields with given values
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    // Copy constructor
    public Constructor(Constructor other) {
        // Create an exact copy of the existing object
        this.name = other.name;
        this.age = other.age;
        this.GPA = other.GPA;
    }

    // Getter and setter methods (not shown for brevity)
    
    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + GPA);
    }

    public static void main(String[] args) {
        // Create objects using different constructors
        Constructor obj1 = new Constructor(); // Default constructor
        Constructor obj2 = new Constructor("Urvashi", 21, 3.6); // Parameterized constructor
        Constructor obj3 = new Constructor(obj2); // Copy constructor
        
        // Display details of each object
        System.out.println("Object 1:");
        obj1.displayDetails();
        
        System.out.println("\nObject 2:");
        obj2.displayDetails();
        
        System.out.println("\nObject 3 (copy of Object 2):");
        obj3.displayDetails();
    }
}
