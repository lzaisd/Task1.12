import java.util.Arrays;

public class Map {
    private String[] keyData;
    private Object[] valueData;
    public static final int DEFAULT_START_SIZE = 16;
    private int count;

    public Map(int startSize) {
        keyData = new String[startSize];
        valueData = new String[startSize];
        count = 0;
    }
    public Map() {
        this(DEFAULT_START_SIZE);
    }

    public boolean put(String key, Object value) throws Exception {
        if (key == null || value == null) {
            throw new Exception("Key or value is null");
        }
        if (contains(key)) {
            return false;
        } else {
            if (count >= keyData.length) {
                keyData = Arrays.copyOf(keyData, count * 2);
                valueData = Arrays.copyOf(valueData, count * 2);
            }
            keyData[count] = key;
            valueData[count] = value;
            count++;
            return true;
        }
    }

    private boolean contains(String key) {
        if (key == null) {
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (keyData[i].equals(key)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return count;
    }

    public String[]	keysToArray() {
        return Arrays.copyOf(keyData, count);
    }
    public String[]	valuesToArray() {
        return (String[]) Arrays.copyOf(valueData, count);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Object get (String key) throws Exception {
        if (contains(key)) {
            for (int i = 0; i < count; i++) {
                if (keyData[i].equals(key)) {
                    return valueData[i];
                }
            }
        } else {
            throw new Exception("Key not found");
        }
        return null;
    }

    public boolean remove(String key) {
        if (key == null) {
            return false;
        }
        if (!contains(key)) {
            return false;
        } else {
            int index = 0;
            for (int i = 0; i < count; i++) {
                if (keyData[i].equals(key)) {
                    index = i;
                }
            }
            if (index < count - 1) {
                keyData[index] = keyData[count - 1];
                keyData[count - 1] = null;
                valueData[index] = valueData[count - 1];
                valueData[count - 1] = null;
            }
            count--;
            return true;
        }
    }
}