import K.K;
import V.V;

import java.util.*;
import java.util.Map;

import static javax.swing.UIManager.put;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> telephoneDirectory = new HashMap<>();
        telephoneDirectory.put("Иван Иванов", "8(916)078-07-96");
        System.out.println(telephoneDirectory.get("Иван Иванов"));
        telephoneDirectory.put("Иван Петров", "8(916)078-07-55");
        System.out.println(telephoneDirectory.get("Иван Петров"));
        telephoneDirectory.put("Петр Сидоров", "8(916)078-07-56");
        System.out.println(telephoneDirectory.get("Петр Сидоров"));
        telephoneDirectory.put("Петр Смирнов", "8(916)078-07-57");
        System.out.println(telephoneDirectory.get("Петр Смирнов"));
        telephoneDirectory.put("Федол Глинко", "8(916)078-07-58");
        System.out.println(telephoneDirectory.get("Федол Глинко"));
        telephoneDirectory.put("Федот Петров", "8(916)078-07-59");
        System.out.println(telephoneDirectory.get("Федот Петров"));
        telephoneDirectory.put("Антон Шал", "8(916)078-07-60");
        System.out.println(telephoneDirectory.get("Антон Шал"));
        telephoneDirectory.put("Роман Мороз", "8(916)078-07-51");
        System.out.println(telephoneDirectory.get("Роман Мороз"));
        telephoneDirectory.put("Юра Орлов", "8(916)078-07-52");
        System.out.println(telephoneDirectory.get("Юра Орлов"));
        telephoneDirectory.put("Карл Котов", "8(916)078-07-53");
        System.out.println(telephoneDirectory.get("Карл Котов"));
        telephoneDirectory.put("Федя Карлов", "8(916)078-07-54");
        System.out.println(telephoneDirectory.get("Федя Карлов"));
        telephoneDirectory.put("Макс Мозг", "8(916)078-07-61");
        System.out.println(telephoneDirectory.get("Макс Мозг"));
        telephoneDirectory.put("Сергей Гриш", "8(916)078-07-62");
        System.out.println(telephoneDirectory.get("Сергей Гриш"));
        telephoneDirectory.put("Илья Рыба", "8(916)078-07-63");
        System.out.println(telephoneDirectory.get("Илья Рыба"));
        telephoneDirectory.put("Света Рюмина", "8(916)078-07-64");
        System.out.println(telephoneDirectory.get("Света Рюмина"));
        telephoneDirectory.put("Ната Зельц", "8(916)078-07-65");
        System.out.println(telephoneDirectory.get("Ната Зельц"));
        telephoneDirectory.put("Ира Кот", "8(916)078-07-66");
        System.out.println(telephoneDirectory.get("Ира Кот"));
        telephoneDirectory.put("Таня Пет", "8(916)078-07-67");
        System.out.println(telephoneDirectory.get("Таня Пет"));
        telephoneDirectory.put("Иван Скляр", "8(916)078-07-68");
        System.out.println(telephoneDirectory.get("Иван Скляр"));
        telephoneDirectory.put("Саша Петров", "8(916)078-07-69");
        System.out.println(telephoneDirectory.get("Саша Петров"));
    }

    Map<String, List<Integer>> map = new HashMap<>(Map.of("A",List.of(1,2,3),"B", List.of(3,4,5),
            "C", List.of(6,7,8),"D",List.of(9,10,11),"E",List.of(12,13,14));
    Map<String,Integer> copyMap = new HashMap<>();
    map.addAll(Map copyMap);
    List<Integer> nums = new ArrayList<>(List.of(List.of(1,2,3), List.of(3,4,5),
            List.of(6,7,8), List.of(9,10,11), List.of(12,13,14));
    nums.replaceAll (java.awt.List(6, 12, 21, 30, 39));
    Map<Integer, String> map1 = new HashMap<>(Map.of(1,"A",2,"B",3,"C",4,"D",5,"E",
            6,"F",7,"G",8,"H",9,"I",10,"j"));


}