package com.samuelvazquez.oop

class Motorcycles {
    String name
    String color
    String model

    def startEngine() {
        println "Engine started for $name"
    }

    def stopEngine() {
        println "Engine stopped for $name"
    }

    def accelerate() {
        println "Accelerating $name"
    }
}
