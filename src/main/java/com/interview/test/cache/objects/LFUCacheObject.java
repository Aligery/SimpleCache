package com.interview.test.cache.objects;

public class LFUCacheObject extends CacheObject {

    private long hits = 0; //Than more hits, then more priority


    public long incrementAndGetHits() {
        return ++hits;
    }

    public long getHits() {
        return hits;
    }


}
