package com.samuelvazquez.abstraction.interfaces

class Toyota implements Car{

    @Override
    def startEngine() {
        println "starting engine..."
    }

    @Override
    def stopEngine() {
        println "stopping engine..."
    }

    static void main(String[] args) {
        Toyota toyota = new Toyota()
        toyota.startEngine()
        toyota.stopEngine()
    }
}
