package com.samuelvazquez.loops

for(int i =1 ; i < 5; i++) {
    println i
}

println "\nusing for in"
// for in
for(i in 1..5) {
    println i
}

println "\nusing upto method"
1.upto(5) {println "$it" }

println "\nusing times method"
5.times {println "${it+1}" }

println "\nusing step method"
1.step(10, 2) {println "$it"}
0.step(16, 2) {println "$it"}

// iterate over a range
def x = 0
for ( i in 0..9 ) {
    x += i
}
assert x == 45

// iterate over a list
x = 0
for ( i in [0, 1, 2, 3, 4] ) {
    x += i
}
assert x == 10

// iterate over an array
def array = (0..4).toArray()
x = 0
for ( i in array ) {
    x += i
}
assert x == 10

// iterate over a map
def map = ['abc':1, 'def':2, 'xyz':3]
x = 0
for ( e in map ) {
    x += e.value
}
assert x == 6

// iterate over values in a map
x = 0
for ( v in map.values() ) {
    x += v
}
assert x == 6

// iterate over the characters in a string
def text = "abc"
def list = []
for (c in text) {
    list.add(c)
}
assert list == ["a", "b", "c"]

// while loop
def x1 = 0
def y1 = 5

while ( y1-- > 0 ) {
    x1++
}

assert x1 == 5