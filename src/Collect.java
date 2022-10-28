import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Collect{
    HashMap<String, Integer> collect = new HashMap <>();
    private java.lang.String String;
    private java.lang.Integer Integer;

    public Collect(HashMap<java.lang.String, java.lang.Integer> collect) {
        this.collect = collect;
    }

    public HashMap<String, Integer> getCollect() {
        return collect;
    }
    public void putCollect (){//добавление в коллекцию
        collect.put(String, Integer);
    }
    public void containsKey (){//проверка наличия ключа
        try {
            boolean b = collect != null;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }finally {
            collect.containsKey(String);
        }




}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collect collect1 = (Collect) o;
        return collect.equals(collect1.collect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collect);
    }

    @Override
    public String toString() {
        return "Collect{" +
                "collect=" + collect +
                '}';
    }
}
