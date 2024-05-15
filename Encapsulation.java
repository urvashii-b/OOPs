public class Encapsulation {
    public static void main(String[] args) {
        Person myObj = new Person();

        // Accessing 'name' using the public getter method
        myObj.setName("Urvashi");

        // Retrieving and printing 'name' using the public getter method
        System.out.println(myObj.getName());

        /*  
        wrong way
        
        myObj.name = "John"; // error
        System.out.println(myObj.name); // error
        */
    }
}

class Person {
    private String name; // private = restricted access

    // Getter method to retrieve the value of 'name'
    public String getName() {
        return name;
    }

    // Setter method to set the value of 'name'
    public void setName(String newName) {
        this.name = newName;
    }
}
