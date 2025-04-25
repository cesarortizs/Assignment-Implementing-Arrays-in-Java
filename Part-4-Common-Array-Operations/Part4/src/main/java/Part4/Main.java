package Part4;

public class Main {
    public static void main(String[] args) {
        // Create an array of 10 integers
        int[] integerArray = new int[10];

        // Fill the array with multiples of 3
        for(int i = 0; i < integerArray.length; i++)
        {
            integerArray[i] = (i + 1) * 3;
        }

        // Print the length of the array and all its elements
        System.out.println("\nThe length of the array is: " + integerArray.length);
        System.out.println("\nThe content of the array is:");

        for(int i = 0; i < integerArray.length; i++)
        {
            System.out.println(integerArray[i]);
        }
    }
}