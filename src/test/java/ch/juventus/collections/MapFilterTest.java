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
        Map<Integer, String> filteredMap = mapFilter.cleanup(map, "aaa");

        // Then
        assertEquals(filteredMap.size(), 3);
        assertArrayEquals(filteredMap.values().toArray(new String[3]), new String[] {"aaa", "aaa", "aaa"});
    }

    @Test
    void testMapFilterWithLambda() {
        // Given
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aaa");
        map.put(2, "bbb");
        map.put(3, "aaa");
        map.put(4, "ccc");
        map.put(5, "aaa");


        // When
        Map<Integer, String> filteredMap = mapFilter.cleanupWithLambda(map, "aaa");

        // Then
        assertEquals(filteredMap.size(), 3);
        assertArrayEquals(filteredMap.values().toArray(new String[3]), new String[] {"aaa", "aaa", "aaa"});
    }

}