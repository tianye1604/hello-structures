package com.hello.structrue.array;

public class Array {

    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;

    private int[] data;
    private int size;

    /**
     *  构造函数，传入数组的容量capactiy构造Array
     * @param capacity
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     *  无参数的构造函数，默认数组的容量capacity=10
     */
    public Array() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * 获取数组中的元素个数
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     *  获取数组的容量
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     *  判断数组是否为空
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }
}
