package Part3;

public class Main {
    public static void main(String[] args) {
        // Create an array of 5 integers
        // Initialize the array with values
        int[] integerArray = {1, 2, 3, 4, 5};

        // Update the third element to a new value
        integerArray[2] = 20;

        // Print all elements of the array
        for(int i = 0; i < integerArray.length; i++)
        {
            System.out.println(integerArray[i]);
        }
    }
}