package com.xyf.Builder;

public class Director {
    public static Aimpl buildA(builder builder){
        Aimpl aimpl = (Aimpl) builder;
        aimpl.build();
        return aimpl;
    }
    public static Bimpl buildB(builder builder){
        Bimpl bimpl = (Bimpl) builder;
        bimpl.build();
        return bimpl;
    }

}
