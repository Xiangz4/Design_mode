package com.xyf.Builder;

public class Bimpl implements builder{
    @Override
    public void reset() {
        System.out.println("Bimpl is reset");
    }

    @Override
    public void setA() {
        System.out.println("Bimpl Set A");
    }

    @Override
    public void setB() {
        System.out.println("Bimpl Set B");
    }

    public  void build(){
        setA();
        setB();
    }
}
