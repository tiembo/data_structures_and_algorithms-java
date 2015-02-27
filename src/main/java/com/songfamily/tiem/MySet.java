package com.songfamily.tiem;

public class MySet {
    private int ARRAY_INCREMENT;
    private int[] storage;
    private int mSize;

    public MySet() {
        this(5);
    }

    public MySet(int increment) {
        ARRAY_INCREMENT = increment;
        mSize = 0;
        storage = new int[ARRAY_INCREMENT];
    }

    public int size() {
        return mSize;
    }

    public boolean add(int i) {
        if (contains(i))
            return false;

        if (mSize == storageLength())
            expandStorage();

        storage[mSize] = i;
        mSize++;
        return true;
    }

    public boolean contains(int i) {
        for (int j : storage)
            if (i == j)
                return true;

        return false;
    }

    public String toString() {
        if (mSize == 0)
            return "";

        String result = String.valueOf(storage[0]);
        if (mSize == 1)
            return result;

        for (int i = 1; i < mSize; i++)
            result += " " + String.valueOf(storage[i]);

        return result;
    }

    protected void expandStorage() {
        int oldSize = storage.length;
        int[] oldStorage = new int[oldSize];

        System.arraycopy(storage, 0, oldStorage, 0, mSize);

        storage = new int[oldSize + ARRAY_INCREMENT];
        System.arraycopy(oldStorage, 0, storage, 0, mSize);
    }

    protected int storageLength() {
        return storage.length;
    }
}
