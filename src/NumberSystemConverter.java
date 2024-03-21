import java.util.Scanner;

public class NumberSystemConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selection;

        do {
            System.out.println("Number System Converter Menu:");
            System.out.println("A - Convert from binary/hexadecimal to decimal");
            System.out.println("B - Convert from decimal to binary/hexadecimal");
            System.out.println("C - Add two numbers");
            System.out.println("D - Subtract two numbers");
            System.out.println("E - Multiply two numbers");
            System.out.println("F - Incorrect option, supposed to be 'Divide two numbers'");
            System.out.println("W - Terminate the program");
            System.out.print("Select an option: ");

            selection = scanner.nextLine().toUpperCase();

            switch (selection) {
                case "A":
                    convertToDecimal(scanner);
                    break;
                case "B":
                    convertFromDecimal(scanner);
                    break;
                case "C":
                case "D":
                case "E":
                    performOperation(scanner, selection);
                    break;
                case "F":
                    System.out.println("Option F seems to be incorrect in the provided document. Did you mean 'Divide two numbers'?");
                    break;
                case "W":
                    System.out.println("Terminating the program.");
                    break;
                default:
                    System.out.println("Invalid selection, please try again.");
                    break;
            }
        } while (!selection.equals("W"));
    }

    private static void convertToDecimal(Scanner scanner) {
        System.out.print("Enter the number (binary or hexadecimal starting with 0x): ");
        String input = scanner.nextLine();
        try {
            int decimal;
            if (input.startsWith("0x")) {
                decimal = Integer.parseInt(input.substring(2), 16);
            } else {
                decimal = Integer.parseInt(input, 2);
            }
            System.out.println("Decimal: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }

    private static void convertFromDecimal(Scanner scanner) {
        System.out.print("Enter the decimal number: ");
        int decimal = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Convert to (B)inary or (H)exadecimal? ");
        String choice = scanner.nextLine().toUpperCase();
        switch (choice) {
            case "B":
                System.out.println("Binary: " + Integer.toBinaryString(decimal));
                break;
            case "H":
                System.out.println("Hexadecimal: " + Integer.toHexString(decimal));
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
    }

    private static void performOperation(Scanner scanner, String operation) {
        System.out.print("Enter the first number (decimal): ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number (decimal): ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // consume newline
        int result;
        switch (operation) {
            case "C": // Add
                result = num1 + num2;
                System.out.println("Result of addition: " + result);
                break;
            case "D": // Subtract
                result = num1 - num2;
                System.out.println("Result of subtraction: " + result);
                break;
            case "E": // Multiply
                result = num1 * num2;
                System.out.println("Result of multiplication: " + result);
                break;
            default:
                System.out.println("Operation not supported.");
                break;
        }
    }
}
