package com.samuelvazquez.datatypes

// byte
byte b = 10
println b
println Byte.MIN_VALUE
println Byte.MAX_VALUE
println '=============='
//short
short s = 100
println s
println Short.MIN_VALUE
println Short.MAX_VALUE
println '=============='
int i = 1000
println i
println Integer.MIN_VALUE
println Integer.MAX_VALUE
println '=============='
int l = 100000
println l
println Long.MIN_VALUE
println Long.MAX_VALUE
println '=============='
float f = 100.002F
println f
println Float.MIN_VALUE
println Float.MAX_VALUE
println '=============='
double d = 100.0002F
println d
println Double.MIN_VALUE
println Double.MAX_VALUE
println '=============='
char c = 'A'
println c
boolean flag = true
println flag
String str = "Groovy is cool"
println str
// now using 'def' keyword
def x = 10
println x
println x.getClass().getSimpleName()
// casting between types
def y = (byte)10
println y
println y.getClass().getSimpleName()

