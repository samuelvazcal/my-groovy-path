package com.samuelvazquez.variables

def name = "Samuel"
println 'Name is ' + name
println 'Name is ${name}' //it will no work as expected, so seems work pretty similar to ES6
println "Name is ${name}"
name = 10
// groovy is dynamically typed (resolved during runtime)
println "Now, value of name is $name"

def(a,b,c) = [10,20,30]
println a
println b
println c
def(String a1, int b1, double c1) = [40,50,60]
println a1
println b1
println c1

// what about cases when there is no a value assigned to a variable ... well, we have a null value
// def d
// println d

