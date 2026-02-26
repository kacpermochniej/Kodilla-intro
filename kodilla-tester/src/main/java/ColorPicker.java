import java.util.Scanner;

public class ColorPicker {


    public static String getColorName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first letter of a color (e.g., R, G, B, Y):");


        String input = scanner.nextLine().trim().toUpperCase();

        if (input.isEmpty()) {
            return "Error: No input provided!";
        }


        char firstLetter = input.charAt(0);


        switch (firstLetter) {
            case 'R':
                return "Red";
            case 'G':
                return "Green";
            case 'B':
                return "Blue";
            case 'Y':
                return "Yellow";
            case 'W':
                return "White";
            case 'K':
                return "Black";
            default:
                return "Unknown color for letter: " + firstLetter;
        }
    }

    public static void main(String[] args) {

        String result = getColorName();


        System.out.println("The selected color is: " + result);
    }
}