package ImportantAlgorithms;
import java.util.*;
public class Hashmaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Peter", 1);
        map.put("Lu", 2);
        map.put("Peter", 3);
        System.out.println(map.get("Peter"));
    }
}
