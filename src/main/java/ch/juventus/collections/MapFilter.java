package ch.juventus.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public class MapFilter {

    public <K, V> Map<K, V> cleanup (Map<K, V> map, V value) {
        if (map == null || map.isEmpty()) {
            return Collections.emptyMap();
        }

        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (!entry.getValue().equals(value)) {
                iterator.remove();
            }
        }

        return map;
    }

    public <K, V> Map<K, V> cleanupWithLambda (Map<K, V> map, V value) {
        if (map == null || map.isEmpty()) {
            return Collections.emptyMap();
        }

        map.entrySet().removeIf(entry -> !entry.getValue().equals(value));

        return map;
    }

}
