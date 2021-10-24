package com.samuelvazquez.methods

def printHello() {
    println "Hello..."
}

printHello()

def sum(int a, int b) {
    println "Sum is ${a + b}"
    println "Sum is " + (a + b)
}

sum(5, 2)

// default value parameters
def sumA(int a = 10, int b = 20) {
    println "Sum is ${a + b}"
    println "Sum is " + (a + b)
}
sumA()

// default value parameters case 2
def sumB(int a, int b = 20) {
    println "Sum is ${a + b}"
}
sumB(100)

def sub(int a, int b) {
    def c = a - b
    return c
}

def result = sub(10,5)
println result