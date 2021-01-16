package com.interview.test;

import com.interview.test.cache.Cache;
import com.interview.test.cache.LFUCache;
import com.interview.test.cache.objects.LFUCacheObject;

public class Main {

    public static void main(String[] args) {
        Cache<LFUCacheObject> cache = new LFUCache(10);

        LFUCacheObject first = new LFUCacheObject();
        LFUCacheObject second = new LFUCacheObject();
        LFUCacheObject third = new LFUCacheObject();

        cache.putCacheObject("1", first);
        cache.putCacheObject("2", second);
        cache.putCacheObject("3", third);
        cache.putCacheObject("1", first);
        System.out.println(cache.getListObjectsFromCache());
    }



}
