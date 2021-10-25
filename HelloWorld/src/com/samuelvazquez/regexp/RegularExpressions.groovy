package com.samuelvazquez.regexp

def regex = /(?:[^Groovy]*)/
def matchA =  "Groovy" =~ "Groovy"
println matchA[0]
def matchB =  "Groovy" =~ "Glo"
if(matchB) {
    println matchB[0]
} else {
    println "No match found"
}
def matchC = "This is Groovy" =~ regex
if(matchC) {
    println matchC[0]
} else {
    println "No match found"
}