package com.interview.test.cache.objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LFUCacheObjectTest {

    private LFUCacheObject cacheObject;


    @BeforeEach
    public void init() {
        cacheObject = new LFUCacheObject();
        cacheObject.setValue("SomeValue");
    }

    @Test
    void incrementAndGetHits_ok() {
        long expectedHits = 0;
        assertEquals(expectedHits, cacheObject.getHits());
        assertEquals(++expectedHits, cacheObject.incrementAndGetHits());
    }

}