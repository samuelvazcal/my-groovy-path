package com.samuelvazquez.classes_objects

class Fruits {

    private String fruitName
    private String fruitColor

    def setFruitName(String name) {
        fruitName = name
    }

    def setFruitColor(String color) {
        fruitColor = color
    }

    def getFruitName() {
        println "Name of the fruit is $fruitName"
    }

    def getFruitColor() {
        println "Color of the fuit is $fruitColor"
    }

    static void main(String[] args) {
        // creating fruit objects
        Fruits apple = new Fruits()
        apple.setFruitName("Apple")
        apple.setFruitColor("Red")

        apple.getFruitName()
        apple.getFruitColor()
    }
}
