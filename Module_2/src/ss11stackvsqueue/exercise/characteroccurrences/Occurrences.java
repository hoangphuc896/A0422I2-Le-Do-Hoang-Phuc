package ss11stackvsqueue.exercise.characteroccurrences;

import java.util.Scanner;
import java.util.TreeMap;

public class Occurrences {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Chain String: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        String[] strArr = str.split("");
        for (String element : strArr) {
            if (treeMap.containsKey(element)) {
                treeMap.put(element, treeMap.get(element) + 1);
            } else {
                treeMap.put(element, 1);
            }
        }
        System.out.println(treeMap.entrySet());
    }
}
