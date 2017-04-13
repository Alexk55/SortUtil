import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by lidongyu on 2017/3/28.
 */
public class ExeForth {
    public static void main(String[] args) {
        //iterate時，保證其順序為Natural Ordering或Comparator來決定
        Map<String, String> tm = new TreeMap<String, String>();

        tm.put("J", "John");
        tm.put("M", "Mary");
        tm.put("B", "Bill");
        tm.put("C", "Christine");
        tm.put("A", "Ariel");

        printMap(tm);

        System.out.println("----------by comparator");

//sort by comparator
        tm = new TreeMap<String,String> (new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        tm.put("J", "John");
        tm.put("M", "Mary");
        tm.put("B", "Bill");
        tm.put("C", "Christine");
        tm.put("A", "Ariel");

        printMap(tm);
    }
    public static void printMap(Map<String,String> map) {

        for (Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
    }
}
