package com.samuelvazquez.conditionalst

def num = 11

if(num == 10) {
    println "num is 10"
    //
} else {
    println "num is not 10"
}

// switch
def x = -10
def result
switch(x) {
    case 0:
        result = "x is zero"
        break
    case {x > 0}:
        result = "x is positive number"
        break
    case {x < 0}:
        result = "x is negative number"
        break
    default:
        result = "not a number"
}
println result