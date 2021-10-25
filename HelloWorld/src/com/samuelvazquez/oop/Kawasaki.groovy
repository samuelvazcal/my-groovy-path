package com.samuelvazquez.oop

class Kawasaki extends Motorcycles {

    int topSpeed

    def topSpeed() {
        println "Top speed is $topSpeed"
    }

    static void main(String[] args) {
        Kawasaki motorcycle1 = new Kawasaki()
        motorcycle1.name = "Kawasaki"
        motorcycle1.color = "Red"
        motorcycle1.model = 2019
        motorcycle1.topSpeed = 200
        motorcycle1.startEngine()
        motorcycle1.accelerate()
        motorcycle1.topSpeed()
        motorcycle1.stopEngine()
    }
}
