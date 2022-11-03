import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map1 {
    private static Map<Integer, String> maps = new LinkedHashMap<>();
    public static void main(String[] args) {
        maps = new LinkedHashMap<>(Map.of(1, "A", 2, "B", 3, "C", 4, "D", 5, "E",
                6, "F", 7, "G", 8, "H", 9, "I", 10, "j"));
        for (Map.Entry <Integer, String> map1 : maps.entrySet()) {
            System.out.println("Key = " + map1.getKey() + ", Value = " + map1.getValue());
        }
    }

    public interface Entry<T, T1> {
    }
}
