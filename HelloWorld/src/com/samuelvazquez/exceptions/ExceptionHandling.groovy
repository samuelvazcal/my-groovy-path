package com.samuelvazquez.exceptions

try {
int i = 1/1;

} catch(ArithmeticException e) {
    println "Catch block to catch Arithmetic exp"
} catch(Exception exp) {
    println "I am inside exception block"
    println exp.getCause()
    println exp.getMessage()
    exp.printStackTrace()
} finally {
    println "I am inside exception block"
}

println "Another set of code"

