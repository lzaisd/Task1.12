import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {

    @Test
    void sizeTest() throws Exception {
        Map testDictionary = new Map();
        String[] keys = {"1", "2", "3", "4", "5", "6"};
        String[] values = {"a3e", "bb3e", "cc34fd", "3ed", "ffff34", "hhdww"};
        for (int i = 0; i < keys.length; i++) {
            testDictionary.put(keys[i], values[i]);
        }

        assertEquals(6, testDictionary.size());
    }

    @Test
    void isEmptyTest() throws Exception {
        Map testDictionary = new Map();
        String[] keys = {"1", "2", "3", "4", "5", "6"};
        String[] values = {"a3e", "bb3e", "cc34fd", "3ed", "ffff34", "hhdww"};
        for (int i = 0; i < keys.length; i++) {
            testDictionary.put(keys[i], values[i]);
        }

        assertFalse(testDictionary.isEmpty());
    }

    @Test
    void isEmptyTest2() {
        Map testDictionary = new Map();

        assertTrue(testDictionary.isEmpty());
    }

    @Test
    void getTest() throws Exception {
        Map testDictionary = new Map();
        String[] keys = {"1", "2", "3", "4", "5", "6"};
        String[] values = {"a3e", "bb3e", "cc34fd", "3ed", "ffff34", "hhdww"};
        for (int i = 0; i < keys.length; i++) {
            testDictionary.put(keys[i], values[i]);
        }

        assertEquals("a3e", testDictionary.get("1"));
    }
    @Test
    void getTest2() throws Exception {
        Map testDictionary = new Map();
        String[] keys = {"1", "2", "3", "4", "5", "6"};
        String[] values = {"a3e", "bb3e", "cc34fd", "3ed", "ffff34", "hhdww"};
        for (int i = 0; i < keys.length; i++) {
            testDictionary.put(keys[i], values[i]);
        }

        assertEquals("hhdww", testDictionary.get("6"));
    }
}