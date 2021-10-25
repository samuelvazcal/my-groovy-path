package com.samuelvazquez.oop

class Car {
    String name
    String color
    int model

    def getCarDetails() {
        println "You are driving $model, $color colored $name"
    }

    def startEngine() {
        println "Starting engine for $name"
    }
}
