package com.interview.test.cache;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LRUCacheTest {


    private static final int SIZE_TEST_CACHE = 5;

    private Cache cache;

    @BeforeEach
    public void init() {
        cache = new LRUCache(SIZE_TEST_CACHE);
    }

    @Test
    public void add_5_element_ok() {

    }

    @Test
    public void add_100_element_ok() {

    }

}