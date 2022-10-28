import java.util.HashMap;
import java.util.List;

public class Map {
    private HashMap<String, List<Integer>> map = new HashMap<>();

    public Map(HashMap<String, List<Integer>> map) {
        this.map = map;
    }

    public HashMap<String, List<Integer>> getMap() {
        return map;
    }
    public void addMap (Map map){
        System.out.println(map.getMap());
    }

}
