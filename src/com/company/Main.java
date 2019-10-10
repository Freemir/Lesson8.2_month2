package com.company;

public class Main {

    public static void main(String[] args) {
        Box<Number,Number> box1 = new Box<>(1.1, 1);
        Box<Float,Float> box2 = new Box<>(2.1f,2.2f);
        addition(box1,box2);
    }
    public static void addition (Box<? extends Number,? extends Number> parameter1, Box<? extends Number,? extends Number> parameter2){
        System.out.println(parameter1.getNumber1().doubleValue() + parameter1.getNumber2().doubleValue() + parameter2.getNumber1().doubleValue() + parameter2.getNumber2().doubleValue());
        System.out.println(parameter1.getNumber1().doubleValue() * parameter1.getNumber2().doubleValue() * parameter2.getNumber1().doubleValue() * parameter2.getNumber2().doubleValue());
    }
}
