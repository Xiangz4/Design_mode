package com.xyf.Builder;

public class Aimpl implements builder{
    @Override
    public void reset() {
        System.out.println("Aimpl is reset");
    }

    @Override
    public void setA() {
        System.out.println("A Set");
    }

    @Override
    public void setB() {
        System.out.println("B set");
    }

    public void build(){
        this.setA();
        this.setB();
    }


}
