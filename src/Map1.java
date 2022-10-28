import java.util.HashMap;
import java.util.List;

public class Map1 <A> {
    private HashMap<Integer, String> map1 = new HashMap<>();

    public Map1(HashMap<Integer, String> map1) {
        this.map1 = map1;
    }
    public HashMap<Integer, String> getMap1() {
        return map1;
    }
    public void addMap1 (Map1 map1){
        System.out.println(map1.getMap1());
    }
}
