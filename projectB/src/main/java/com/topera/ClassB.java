package com.topera;

public class ClassB {

    public static String getValue() {
        return "B";
    }

    public static String getValueBC() {
        return "B" + ClassC.getValue();
    }

}
