package com.samuelvazquez.strings

def name = "Samuel"
println name
println "My name is " + name
println "My name is ".concat(name)

println "My name is ${name}"

def s1 = """This is a groovy class and 
we are learning strings"""
println s1

def lastName = "Vazquez"
println lastName.length()
println lastName[2]
println lastName[-2]
println lastName.indexOf('q')
println name[0..2]
println name[5..3]
println name[0,2,4]

println name.substring(2)
println name.substring(1,4)

def str = "This is a groovy class"
println str.split(" ")
println str-("groovy")
println str.replace("class","session")
println str.toLowerCase()
println str.toUpperCase()
println str.toList()
println "Groovy " * 3
println "Abc" == "Abc"
println "Abc".equalsIgnoreCase("abc")

def location = "over there"
def sA = /a green sky $location/
def sB = $/a blue tree $location/$
println sA
println sB
def s3 = "My name is \"Samuel\""
println s3
def s4 = /My name is "Samuel"/
println s4

