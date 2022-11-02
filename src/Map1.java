import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map1 {
    private static Map<Integer, String> map1 = new LinkedHashMap<>();
    public static void main(String[] args) {
        map1 = new LinkedHashMap<>(Map.of(1, "A", 2, "B", 3, "C", 4, "D", 5, "E",
                6, "F", 7, "G", 8, "H", 9, "I", 10, "j"));
        System.out.println(map1);
    }
}
