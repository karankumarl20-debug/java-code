public class ParameterizedConstructor {
    int x;

    // Parameterized constructor
    public ParameterizedConstructor(int value) {
        x = value; // Initialize x with the provided value
    }

    public void display() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(20); // Create an object using the parameterized constructor
        obj.display(); // Display the value of x
    }
}   