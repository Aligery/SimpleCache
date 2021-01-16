package com.interview.test.cache;

import com.interview.test.cache.objects.CacheObject;

import java.util.Collection;

public interface Cache<T extends CacheObject> {

    public Collection<T> getListObjectsFromCache();

    public T putCacheObject(String key, T object);

}
