package ss13searchalgorithm.exercise;

import java.util.Scanner;

public class CharacterStringSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a string: ");
        String inputString = scanner.nextLine();
        String outputString = "";
        int ascii = 0;

        for (char c : inputString.toCharArray()) {
            if (c > ascii) {
                outputString += c;
                ascii = c;
            }
        }

        System.out.println(outputString);
    }
}

