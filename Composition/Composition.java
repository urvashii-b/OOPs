// The Composition is a way to design or implement the "has-a" relationship.

class Composition {
    public static void main(String[] args) {
        // Create a Ninja object
        Ninja ninjaCar = new Ninja();

        // Set colour and maximum speed for the Ninja car
        ninjaCar.setColour("Orange");
        ninjaCar.setMaxSpeed(180);

        // Display car details
        ninjaCar.carDetails();

        // Perform Ninja oil action
        ninjaCar.ninjaOil();
    }
}

// CarOil class representing the oil-related functionalities
class CarOil {
    // Method to fill oil in the car
    public void fillOil() {
        System.out.println("The fuel is full in the car");
    }

    // Method to indicate low oil in the car
    public void emptyOil() {
        System.out.println("The car has low oil");
    }
}

// Car class representing a car with colour and maximum speed attributes
class Car {
    private String colour;
    private int maxSpeed;

    // Method to display car details
    public void carDetails() {
        System.out.println("Car Colour: " + colour + ", Maximum Speed: " + maxSpeed);
    }

    // Setter methods for colour and maxSpeed attributes
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

// Ninja class representing a Ninja car that inherits from Car and has additional functionalities
class Ninja extends Car {
    // Method to perform Ninja oil-related action using composition
    public void ninjaOil() {
        CarOil ninjaOil = new CarOil(); // Composition - Ninja has-a CarOil object
        ninjaOil.emptyOil();
    }
}

