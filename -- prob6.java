// Superclass samiul
class samiul{
    int x = 8000;    // Variable to store x fees
    int y = 7000;  // Variable to store y fees
}

// Subclass pb6 which extends samiul
public class prob6 extends samiul {
    int z = 4000;  // Variable to store private fees

    // Constructor for prob6
    public prob6() {
        super();  // Call the constructor of the superclass samiul
        this.z = 2000;  // Use 'this' keyword to refer to the instance variable z
    }

    public static void main(String[] args) {
        prob6 t = new prob6();  // Create an instance of the subclass prob6

        // Accessing and printing the variables from both the superclass and subclass
        System.out.println("samiul's x fees: " + t.x);
        System.out.println("samiul's y fees: " + t.y);
        System.out.println("samiul's private fees: " + t.z);
    }
}