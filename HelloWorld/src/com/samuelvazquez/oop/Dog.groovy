package com.samuelvazquez.oop

class Dog extends Animal{

    String dogName

    def plays() {
        println "$dogName likes to play"
    }

    @Override
    def eats() {
        println "$dogName likes to eat"
    }
}
