public class DefaultConstructor {
    int x;

    // Default constructor
    public DefaultConstructor() {
        x = 10; // Initialize x to a default value
    }

    public void display() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor(); // Create an object using the default constructor
        obj.display(); // Display the value of x
    }
}