import java.util.*;

public class Main {
    public static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        map.put(1, "Алла");
        map.put(2, "Алина");
        map.put(3, "Антон");
        map.put(4, "Маша");
        map.put(5, "Маша");
        map.put(6, "Яна");

        Main run = new Main();
        run.isUnique(map);
    }

    public boolean isUnique(Map<Integer, String> map) {
        List<String> list = new ArrayList<>(map.values());
        int hashMapIterator = 0;
        String val = null;
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            int arrayListIterator = 0;
            hashMapIterator++;
            Map.Entry mEntry = (Map.Entry) iter.next();
            val = mEntry.getValue().toString();
            for (String lst: list) {
                arrayListIterator++;
                if (val.equals(lst) && hashMapIterator != arrayListIterator) {
                    System.out.println("Дубли присутствуют");
                    return true;
                }
            }
        }
        System.out.println("Дубли отсутствуют");
        return false;
    }
}

