package com.interview.test.cache.objects;

public class LRUCacheObject extends CacheObject {

    private long age=0; //Then more age then lower priority

    public void rejuvinate(){
        this.age--;
    }

    public void wearOut() {
        this.age++;
    }

    public long getAge() {
        return age;
    }
}
