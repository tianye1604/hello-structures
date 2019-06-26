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

    /**
     *  获取数组中的元素
     * @param index
     * @return
     */
    public int get(int index) {
        if(size <= index){
            throw new IllegalArgumentException("Get is fail,index is illegal!");
        }
        return data[index];
    }

    /**
     * 设置数组指定位置中的元素
     * @param index
     * @param e
     */
    public void set(int index,int e){
        if(index<0 || size <= index){
            throw new IllegalArgumentException("Set is fail,index is illegal!");
        }
        data[index] = e;
    }

    /**
     * 在数组的指定位置,添加元素
     * @param index
     * @param e
     */
    public void add(int index,int e) {
        if(index<0 || index > size){
            throw new IllegalArgumentException("add is fail,index is illegal!");
        }
        for (int i=size-1; i>=index;i--) {
            data[i] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 在数组的头部,添加元素
     * @param e
     */
    public void addFirst(int e){
        add(0,e);
    }

    public void addLast(int e){
        add(size,0);
    }
}
