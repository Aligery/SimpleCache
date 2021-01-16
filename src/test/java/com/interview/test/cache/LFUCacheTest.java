package com.interview.test.cache;

import com.interview.test.cache.objects.LFUCacheObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;


class LFUCacheTest {

    private static final int SIZE_TEST_CACHE = 5;

    private Cache cache;

    @BeforeEach
    public void init() {
        cache = new LFUCache(SIZE_TEST_CACHE);
    }

    @Test
    public void add_1_elemnt_ok() {
        LFUCacheObject lfuCacheObject = new LFUCacheObject();
        lfuCacheObject.setValue("someValue");

        assertDoesNotThrow(() -> cache.putCacheObject("someKey", lfuCacheObject));


        assertEquals(1, cache.getListObjectsFromCache().size());
        assertEquals(lfuCacheObject, cache.getListObjectsFromCache().iterator().next());
    }

    @Test
    public void add_5_element_ok() {

    }

    @Test
    public void add_100_element_ok() {

    }





}