package com.interview.test.cache.objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheObjectTest {

    private LRUCacheObject cacheObject;


    @BeforeEach
    public void init() {
        cacheObject = new LRUCacheObject();
        cacheObject.setValue("SomeValue");
    }

    @Test
    void rejuvinate() {
        long expectedAge = -1;
        cacheObject.rejuvinate();
        assertEquals(expectedAge, cacheObject.getAge());
    }

    @Test
    void wearOut() {
        long expectedStartedAge = 0;
        assertEquals(expectedStartedAge, cacheObject.getAge());
        cacheObject.wearOut();
        assertEquals(++expectedStartedAge, cacheObject.getAge());
    }
}