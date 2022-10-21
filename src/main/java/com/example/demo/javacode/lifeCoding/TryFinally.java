package com.example.demo.javacode.lifeCoding;

/*

что выведет данный код?

 */

public class TryFinally {

    private void run () {
        try {
            run();
        } finally {
            run();
        }
    }

    public static void main(String[] args) {
       new TryFinally().run();
    }
}
