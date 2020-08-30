package de.comparus.opensource.longmap;

import java.util.Arrays;

public class LongMapImpl<V> implements LongMap<V> {

    private static final int DEFAULT_INITIAL_CAPACITY = 10;
    private static final float DEFAULT_LOAD_FACTOR = 0.75F;

    private final int initialCapacity;
    private final float loadFactor;

    private int size = 0;
    private int threshold;

    private long[] keys;
    private V[] values;

    public LongMapImpl() {
        this(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    public LongMapImpl(int initialCapacity) {
        this(initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    public LongMapImpl(int initialCapacity, float loadFactor) {
        if (initialCapacity < 0 || initialCapacity > 1073741824) {
            throw new IllegalArgumentException("Illegal initial capacity: " + initialCapacity);
        }

        if (loadFactor <= 0.0F || Float.isNaN(loadFactor)) {
            throw new IllegalArgumentException("Illegal load factor: " + loadFactor);
        }

        this.initialCapacity = initialCapacity;
        this.loadFactor = loadFactor;
        this.threshold = (int) (loadFactor * initialCapacity);

        this.keys = new long[initialCapacity];
        this.values = newArray(initialCapacity);
    }

    public V put(long key, V value) {
        return null;
    }

    public V get(long key) {
        return null;
    }

    public V remove(long key) {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(long key) {
        return false;
    }

    public boolean containsValue(V value) {
        return false;
    }

    public long[] keys() {
        return null;
    }

    public V[] values() {
        return null;
    }

    public long size() {
        return 0;
    }

    public void clear() {

    }

    @SafeVarargs
    private static <T> T[] toGenericArray(T ... elements) {
        return elements;
    }

    @SafeVarargs
    private static <E> E[] newArray(int length, E... array)
    {
        return Arrays.copyOf(array, length);
    }
}
