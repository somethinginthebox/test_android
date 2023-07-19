package com.example.myapplication


fun main(){
    var num1 = 50
    var num2 = 2

    var plusResult =  num1 + num2
    println("num1 + num2는 ${plusResult}이야")
    var minusResult = num1 - num2
    println("num1 - num2는 ${minusResult}이야")
    var multipleResult = num1 * num2
    println("num1 * num2는 ${multipleResult}이야")
    var devideResult = num1 / num2
    println("num1 / num2는 ${devideResult}이야")

    // num2 값 변경
    num2 = 5
    var modResult = num1 % num2
    println("num1 % num2는 ${modResult}이야")
    println("계산끝")


