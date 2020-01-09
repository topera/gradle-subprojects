package com.topera;

public class ClassA {

    public static String getValueA() {
        return "A";
    }

    public static String getValueAB() {
        return "A" + ClassB.getValue();
    }

    public static String getValueABC() {
        return "A" + ClassB.getValueBC();
    }

}
