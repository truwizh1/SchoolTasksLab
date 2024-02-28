public class HelloVistula {
    public static void main(String[] args) {
        System.out.println("Starting the program...");

        String message = "Hello Vistula";
        System.out.println("Message before modification: " + message);

        // Simulating some processing
        for (int i = 0; i < 5; i++) {
            message += " " + i;
        }

        System.out.println("Message after modification: " + message);

    }

}
