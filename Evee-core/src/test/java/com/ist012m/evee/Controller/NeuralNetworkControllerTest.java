package com.ist012m.evee.Controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NeuralNetworkControllerTest {
    static public void main(String[] args) {

    }
    @Test
    void test(){
        result(30);
    }
    public void incr(int x) {
        Object object = null;

        x = x+1;
    }
    public void result(int x) {
        Integer X = x;
        incr(X);
        System.out.println(X);
    }
}