import java.util.*;

public class p2 {
    public static void main(String[] args) {
        addPhone("Директор", "1234");
        addPhone("Директор", "23456234");
        addPhone("Директор", "876");
        addPhone("Директор", "333333");
        addPhone("Директор", "852852852");
        addPhone("Маша", "3727");
        addPhone("Маша", "8545");
        addPhone("Даша", "727825454");
        addPhone("Даша", "8888");
        addPhone("Даша", "453211");
        addPhone("Саша", "782727241275");
        addPhone("Паша", "747474");
        addPhone("Паша", "8-888-888-88-88");
        addPhone("Глаша", "7539512");
        addPhone("Глаша", "77447744");
        addPhone("Глаша", "321654987");
        addPhone("Глаша", "544114");
        addPhone("Наташа", "74174");
        addPhone("Простокваша", "2887987");
        addPhone("Простокваша", "654654654");
        addPhone("Простокваша", "787887878");
        addPhone("Простокваша", "123");
        printPhoneBook();
    }
    private static HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public static void addPhone(String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phone);
    }

    public static void printPhoneBook() {
        List<Map.Entry<String, ArrayList<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, ArrayList<String>>>() {
            @Override
            public int compare(Map.Entry<String, ArrayList<String>> o1, Map.Entry<String, ArrayList<String>> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
    });

        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}