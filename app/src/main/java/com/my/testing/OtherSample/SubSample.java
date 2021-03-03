package com.my.testing.OtherSample;

public class SubSample extends Samples {


    private int[] arr=new int[]{10,20,30};


    public SubSample() {
    }

    public SubSample(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    @Override
    public boolean getBoolean(boolean b) {
        return b;
    }

    @Override
    public char getChar(char c) {
        return c;
    }

    @Override
    public float getFloat(float f) {
        return f;
    }

    @Override
    public Object getObject() {
        return null;
    }


}
