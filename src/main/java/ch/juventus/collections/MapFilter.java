package ch.juventus.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapFilter {

    public <K, V> void cleanup (Map<K, V> map, V value) {
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (!entry.getValue().equals(value)) {
                iterator.remove();
            }
        }
    }

    public <K, V> Map<K, V> cleanup2 (Map<K, V> map, V value) {
        if (map == null || map.isEmpty()) {
            return Collections.emptyMap();
        }

        Map<K, V> filteredMap = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                filteredMap.put(entry.getKey(), entry.getValue());
            }
        }

        return filteredMap;
    }

    public <K, V> Map<K, V> cleanupWithLambda (Map<K, V> map, V value) {
        if (map == null || map.isEmpty()) {
            return Collections.emptyMap();
        }

        map.entrySet().removeIf(entry -> !entry.getValue().equals(value));

        return map;
    }

}
