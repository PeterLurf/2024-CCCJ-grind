package CCC;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
/**
 * CCC16S1
 */
public class CCC16S1 {
    public static void main(String[] args) {
        boolean equal = true;
        Scanner in = new Scanner(System.in);
        String aString = in.nextLine();
        String bString = in.nextLine();
        //count how many '*'s there are in each string using regex
        int aStars = 0;
        int bStars = 0;
        for (int i = 0; i < aString.length(); i++) {
            if (aString.charAt(i) == '*') {
                aStars++;
            }
        }
        for (int i = 0; i < bString.length(); i++) {
            if (bString.charAt(i) == '*') {
                bStars++;
            }
        }
        //remove all '*'s from the strings
        aString = aString.replaceAll("\\*", "");
        bString = bString.replaceAll("\\*", "");
        //create a hashmap to store the frequency of each character in the strings
        HashMap<Character, Integer> aMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> bMap = new HashMap<Character, Integer>();
        for (int i = 0; i < aString.length(); i++) {
            if (aMap.containsKey(aString.charAt(i))) {
                aMap.put(aString.charAt(i), aMap.get(aString.charAt(i)) + 1);
            } else {
                aMap.put(aString.charAt(i), 1);
            }
        }
        for (int i = 0; i < bString.length(); i++) {
            if (bMap.containsKey(bString.charAt(i))) {
                bMap.put(bString.charAt(i), bMap.get(bString.charAt(i)) + 1);
            } else {
                bMap.put(bString.charAt(i), 1);
            }
        }
        //find the frequency differences between letters in the two hashmaps and store them in a new hashmap
        HashMap<Character, Integer> diffMap = new HashMap<Character, Integer>();
        for (char c : aMap.keySet()) {
            if (bMap.containsKey(c)) {
                diffMap.put(c, Math.abs(aMap.get(c) - bMap.get(c)));
            } else {
                diffMap.put(c, aMap.get(c));
            }
        }
        for (char c : bMap.keySet()) {
            if (!aMap.containsKey(c)) {
                diffMap.put(c, bMap.get(c));
            }
        }
        //if the sum of the frequency differences is greater than the number of '*'s, the strings are not equal
        int sum = 0;
        for (int i : diffMap.values()) {
            sum += i;
        }
        if (sum > aStars + bStars) {
            equal = false;
        }
        if (equal) {
            System.out.println("A");
        } else {
            System.out.println("N");
        }

        in.close();

        


    }
     
}