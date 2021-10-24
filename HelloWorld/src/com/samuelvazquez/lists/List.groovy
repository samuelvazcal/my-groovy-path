package com.samuelvazquez.lists

def fruits = ["Apples","Oranges","Grapes"]
println fruits[1]
println fruits.get(0)

def myList = [1,2,3,['A','B',"Groovy"],4]
println myList[3][2]

println myList[0..2]
println myList[4..2]

println myList.contains(2)
println myList.contains("Groovy")
println myList[3].contains("Groovy")

println myList.size()
myList.add(10)
println myList

myList += [30,40]
println myList
myList = myList.plus([50])
println myList

myList = myList - [30,40]
println myList
myList = myList.minus([50])
println myList
myList.pop()
println myList
myList.removeLast()
println myList
myList.reverse()
println myList


