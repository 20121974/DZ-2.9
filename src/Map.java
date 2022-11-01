import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Map {
    private static final HashMap<String, List<Integer>> mapFrom = new HashMap<>();
    private static final HashMap<String, Integer> mapTo = new HashMap<>();

    public static void main(String[] args) {
        Random random = new Random();
        var listOne = new java.util.ArrayList<>(List.of(1, 2, 3));
        for (int i = 0; i < 15; i++) {
            listOne.add(random.nextInt(10));
        }
        var listTw0 = new java.util.ArrayList<>(List.of(3, 4, 5));
        for (int i = 0; i < 15; i++) {
            listTw0.add(random.nextInt(10));
        }
        var listThree = new java.util.ArrayList<>(List.of(6, 7, 8));
        for (int i = 0; i < 15; i++) {
            listThree.add(random.nextInt(10));
        }
        var listFour = new java.util.ArrayList<>(List.of(9, 10, 11));
        for (int i = 0; i < 15; i++) {
            listFour.add(random.nextInt(10));
        }
        var listFive = new java.util.ArrayList<>(List.of(12, 13, 14));
        for (int i = 0; i < 15; i++) {
            listFive.add(random.nextInt(10));
        }
        mapFrom.put("List1", listOne);
        mapFrom.put("List2", listTw0);
        mapFrom.put("List3", listThree);
        mapFrom.put("List4", listFour);
        mapFrom.put("List5", listFive);

        System.out.println(mapFrom);
        for (var keySet:mapFrom.keySet()) {
            Integer sum = 0;
            List<Integer> tempList = mapFrom.get(keySet);
            for (Integer integerSum:tempList) {
                sum += integerSum;
            }
            mapTo.put(keySet, sum);
        }
        System.out.println((mapTo));
    }
}
