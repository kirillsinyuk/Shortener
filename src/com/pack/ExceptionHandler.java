package com.pack;

public class ExceptionHandler {
    public static void log(Exception e){
        System.out.println(e.getCause());
    }
}
