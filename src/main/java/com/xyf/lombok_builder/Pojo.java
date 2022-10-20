package com.xyf.lombok_builder;


import lombok.ToString;

@ToString
public class Pojo implements builder{
    private String name;
    private Integer age;

    public Pojo name(String name){
        this.name = name;
        return this;
    }
    public Pojo(){

    }
    public Pojo(Pojo pojo){
        this.name = pojo.name;
        this.age = pojo.age;
    }

    public Pojo age(Integer age){
        this.age = age;
        return this;
    }

    public static Pojo builder(){
        return new Pojo();
    }
    @Override
    public Pojo build() {
        return new Pojo(this);
    }
}
