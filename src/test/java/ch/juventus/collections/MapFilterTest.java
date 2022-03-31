package ch.juventus.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapFilterTest {

    private MapFilter mapFilter;

    @BeforeEach
    void init() {
        mapFilter = new MapFilter();
    }

    @Test
    void testMapFilter() {
        // Given
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aaa");
        map.put(2, "bbb");
        map.put(3, "aaa");
        map.put(4, "ccc");
        map.put(5, "aaa");

        // When
        mapFilter.cleanup(map, "aaa");

        // Then
        assertEquals(map.size(), 3);
        assertArrayEquals(map.values().toArray(new String[3]), new String[] {"aaa", "aaa", "aaa"});
    }

    @Test
    void testMapFilter2() {
        // Given
        Map<String, String> map = new HashMap<>();
        map.put("1", "aaa");
        map.put("2", "bbb");
        map.put("3", "aaa");
        map.put("4", "ccc");
        map.put("5", "aaa");


        // When
        Map<String, String> filteredMap = mapFilter.cleanup2(map, "aaa");

        // Then
        assertEquals(filteredMap.size(), 3);
        assertArrayEquals(filteredMap.values().toArray(new String[3]), new String[] {"aaa", "aaa", "aaa"});
    }

    @Test
    void testMapFilterWithLambda() {
        // Given
        Map<Double, String> map = new HashMap<>();
        map.put(1.5, "aaa");
        map.put(2.3, "bbb");
        map.put(3.9, "aaa");
        map.put(4.7, "ccc");
        map.put(5.0, "aaa");


        // When
        Map<Double, String> filteredMap = mapFilter.cleanupWithLambda(map, "aaa");

        // Then
        assertEquals(filteredMap.size(), 3);
        assertArrayEquals(filteredMap.values().toArray(new String[3]), new String[] {"aaa", "aaa", "aaa"});
    }

}