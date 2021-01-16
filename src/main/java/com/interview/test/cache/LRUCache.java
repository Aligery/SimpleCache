package com.interview.test.cache;

import com.interview.test.cache.objects.LRUCacheObject;

import java.util.*;

public class LRUCache implements Cache<LRUCacheObject> {

    private int maxSize;

    private Map<String, LRUCacheObject> storage = new LinkedHashMap<>();

    public LRUCache(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public Collection<LRUCacheObject> getListObjectsFromCache() {
        return storage.values();
    }


    @Override
    public LRUCacheObject putCacheObject(String key, LRUCacheObject object) {
        if (storage.containsKey(key)) {
            LRUCacheObject cacheObject = storage.get(key);
            cacheObject.rejuvinate();
            return cacheObject;
        } else {
            storage.forEach((k, v) -> {
                v.wearOut();
            });
            storage.put(key, object);
            while(storage.size()>maxSize) {
                storage.remove(getOldestKeyObject());
            }
            return object;
        }
    }

    private String getOldestKeyObject() {
        String key = "";
        long oldestAge = 0;
        for (Map.Entry<String, LRUCacheObject> entry:storage.entrySet()) {
            if (entry.getValue().getAge()>oldestAge) {
                oldestAge=entry.getValue().getAge();
                key=entry.getKey();
            }
        }
        return key;
    }

}
