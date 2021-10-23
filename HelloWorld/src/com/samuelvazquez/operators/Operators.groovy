package com.samuelvazquez.operators

// Operators
// normal arithmetic operators
assert 1 + 2 == 3
assert 4 - 3 == 1
assert 2 * 2 == 4
assert 3 / 2 == 1.5
assert 10 % 3 == 1
assert 9.intdiv(5) == 1
assert 2 ** 3 == 8

// unary operators
assert +3 == 3
assert -4 == -4
assert -(-1) == 1

// increment ++ && decrement --
int i = 10
println (++i)
println i

// logical operators
// assert !false
// assert true && true
// assert true || false
// logical "not" has a higher priority than the logical "and"
// assert (!false && false) == false
// logical "and" has a higher priority than the logical "or"
// assert true || true && false

// short circuiting
// logical || operator supports short-circuiting: if the left operand is true,
// it knows that the result will be true in any case, so it won't evaluate the right operand
// the right operand will be evaluated only if the left operand is false
// likewise for the logical && operator, if the left operand is false, it knows that the result will be false in any
// case, so it won't evaluate the right operand. The right operand will be evaluated only if the left operand is true
boolean checkIfCalled() {
    called = true
}

// called = false
// true || checkIfCalled()
// assert !called

// called = false
// false || checkIfCalled()
// assert called

// called = false
// false && checkIfCalled()
// assert !called

// called = false
// true && checkIfCalled()
// assert called

// null and the empty string evaluate to false when interpreted as a boolean
println "null vs empty string"
String strA = null
String strB = ''
println strA
println strB
if(!strA && !strB) println 'Great!'

// ternary operator
def output1 = 1>0 ? "1 is greater than 0" : "1  is not greater"
println output1

// Elvis operator
// Useful for returning a 'sensible default' value if an expression resolves to false-ish (as in Groovy truth)
// displayName = user.name ? user.name : 'Anonymous'
/* Usage of the Elvis operator reduces the verbosity of your code and reduces the risks of errors in case of
refactorings, by removing the need to duplicate the expression which is tested in both the condition and the positive
 return value.*/
// displayName = user.name ?: 'Anonymous'
