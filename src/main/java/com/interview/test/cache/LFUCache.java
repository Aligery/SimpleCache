package com.interview.test.cache;

import com.interview.test.cache.objects.LFUCacheObject;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class LFUCache implements Cache<LFUCacheObject> {

    private int maxSize;

    private Map<String, LFUCacheObject> storage = new LinkedHashMap<>();

    public LFUCache(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public Collection<LFUCacheObject> getListObjectsFromCache() {
        return storage.values();
    }

    @Override
    public LFUCacheObject putCacheObject(String key, LFUCacheObject object) {
        if (storage.containsKey(key)) {
            LFUCacheObject objectFromCache = storage.get(key);
            objectFromCache.incrementAndGetHits();
            return objectFromCache;
        } else {
            storage.put(key, object);
            while (storage.size()>maxSize) {
                storage.remove(keyExceessElem());
            }
            return object;
        }
    }

    private String keyExceessElem() {
        String key = "";
        long hits = Long.MAX_VALUE;
        for (Map.Entry<String, LFUCacheObject> entry : storage.entrySet()) {
            if (entry.getValue().getHits()<hits) {
                key = entry.getKey();
                hits = entry.getValue().getHits();
            }
        }
        return key;
    }


}
