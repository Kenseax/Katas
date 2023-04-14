package com.example.demo.javacode.lifeCoding;

import java.util.ArrayList;
import java.util.List;

public class MemoryKill {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(2000*1000*1000);
    }
}
