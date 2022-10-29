import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map {
    private HashMap<String, List<Integer>> map = new HashMap<>();

    private HashMap<String, Integer> copyMap = new HashMap<>();

    public Map(HashMap<String, List<Integer>> map) {
        List<Integer> nums = new ArrayList<>(List.of());
        this.map = map;
    }

    public void Map1(HashMap<String, Integer> copyMap) {
        this.copyMap = copyMap;
    }

    public HashMap<String, List<Integer>> getMap() {
        return map;
    }

    public void addMap(Map map) {
        System.out.println(map.getMap());
    }
    @Override
    public String toString() {
        return super.toString();
    }

    public HashMap<String, Integer> getCopyMap() {
        return copyMap;
    }

}
