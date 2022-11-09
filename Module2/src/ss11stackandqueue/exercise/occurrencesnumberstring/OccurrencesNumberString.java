package ss11stackandqueue.exercise.occurrencesnumberstring;

import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class OccurrencesNumberString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> treemap = new TreeMap();
        System.out.println("Enter String array :");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        String[] strArr = str.split("");
        for (String arr : strArr) {
            if (treemap.containsKey(arr)) {
                treemap.put(arr, treemap.get(arr) + 1);
            } else {
                treemap.put(arr, 1);
            }
        }
        System.out.println(treemap.entrySet());
    }
}
