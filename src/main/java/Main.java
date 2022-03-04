import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);

        Map dictionary = new Map();
        String[] keys = {"aa", "bb", "cc", "d", "ff"};
        String[] values = {"a3e", "bb3e", "cc34fd", "3ed", "ffff34"};
        for (int i = 0; i < keys.length; i++) {
            dictionary.put(keys[i], values[i]);
        }

        for (int i = 0; i < keys.length; i++) {
            dictionary.put(keys[i], values[i]);
        }

        String[] keys1 = dictionary.keysToArray();
        String[] values1 = dictionary.valuesToArray();
        for (int i = 0; i < dictionary.size(); i++) {
            System.out.printf("key = %s, value = %s\n", keys1[i], values1[i]);
        }

        System.out.println();
        System.out.println(dictionary.get("aa"));

        System.out.println();
        dictionary.remove("bb");
        String[] keys2 = dictionary.keysToArray();
        String[] values2 = dictionary.valuesToArray();
        for (int i = 0; i < dictionary.size(); i++) {
            System.out.printf("key = %s, value = %s\n", keys2[i], values2[i]);
        }
    }
}