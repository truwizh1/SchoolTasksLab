public class EvenOrNotEven {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Generated random number: " + randomNumber);

        // Check if the number is even or odd
        if (randomNumber % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
