package com.samuelvazquez.oop

class Student {

    String name
    int sub1Marks
    int sub2Marks

    def printTotal() {
        println "$name has total marks = " + (sub1Marks + sub2Marks)
    }
    static void main(String[] args) {
        Student student1 = new Student()
        student1.name = "John"
        student1.sub1Marks = 88
        student1.sub2Marks = 77
        student1.printTotal()

        Student student2 = new Student()
        student2.name = "Arya"
        student2.sub1Marks = 90
        student2.sub2Marks = 80
        student2.printTotal()

    }
}
