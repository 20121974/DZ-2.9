import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Collect{
    private static HashMap<String, Integer> map = new HashMap <>();
    public static void main(String[] args) {
        map.put("str1", 5);
        map.put("str2", 1);
        map.put("str1", 7);
        System.out.println((map));
    }

    public static void addToMap(String str, Integer count) {
        if (map.containsKey(str) && map.get(str).equals(count)) {
            throw new RuntimeException("We cannot add This str");
        }
        map.put(str, count);
    }

}
