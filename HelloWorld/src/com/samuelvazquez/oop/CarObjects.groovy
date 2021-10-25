package com.samuelvazquez.oop

class CarObjects {
    static void main(args) {
        Car toyota = new Car()
        Car ford = new Car()
        Car mercedes = new Car()

        toyota.name = "Toyota"
        toyota.model = 2019
        toyota.color = "Red"

        ford.name = "Ford"
        ford.model = 2017
        ford.color = "Grey"

        mercedes.name = "Mercedes"
        mercedes.model = 2020
        mercedes.color = "Black"

        toyota.getCarDetails()
        toyota.startEngine()
        println "================="

        ford.getCarDetails()
        ford.startEngine()
        println "================="

        mercedes.getCarDetails()
        mercedes.startEngine()
        println "================="
    }
}
