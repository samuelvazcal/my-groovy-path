package com.samuelvazquez.abstraction

abstract class Car {
    String name
    String color
    int model

    def startEngine() {
        println "Engine started for $name"
    }

    abstract def topSpeed();
}
