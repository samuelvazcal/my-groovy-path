package com.samuelvazquez.input_output



print "Enter your name : "
def name = System.console().readLine()
println "Hello  $name"

print "Enter first number: "
def num1 = System.console().readLine().toInteger()
print "Enter second number: "
def num2 = System.console().readLine().toInteger()

println "$num1 + $num2 = " + (num1 + num2)

//output
def myName = "Samuel"
println "My name is $myName"

printf "My name is %s \n", myName
printf "%s | %s | %d | %.2f \n", ["Samuel","Vazquez",10,20.203]
// inserting padding
printf "%-10s | %10s | %d | %.2f \n", ["Samuel","Vazquez",10,20.203]

