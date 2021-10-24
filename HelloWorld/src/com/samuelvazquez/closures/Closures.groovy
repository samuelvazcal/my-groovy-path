package com.samuelvazquez.closures

def myClosure1 = {
    println "Hello World"
}

myClosure1.call()

def str = "Hello"
def myClosure2 = name -> println "$str ${name}"


myClosure2.call("Samuel")

def myMethod(obj) {
    obj.call("Groovy")
}

myMethod(myClosure2)

def myClosure3 = {
    a,b,c -> return (a+b+c)
}

def res = myClosure3(10,20,30)
println res

def myList1 = ["Apples", "Orange","Grapes"]
println myList1.each { it}

def myMap = ['subject' : 'groovy','topic' : 'closures']
println myMap.each {it }

def myList = [1,2,3,4,5]
println myList.find {item -> item == 3 }
println myList.findAll( {item -> item > 3})
println myList.any( item -> item > 3)
println myList.every( item -> item > 3)
println myList.collect {item -> item*2 }
