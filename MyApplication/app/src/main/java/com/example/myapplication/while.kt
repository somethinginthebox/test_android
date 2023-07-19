package com.example.myapplication

fun main() {
    var i = 0
    while (i < 11) {
        println("나는 ${i}번째 입니다")
        i++
    }
    println("==========================")
    for (a in 1 until 3) {
        println("너는 ${a}번째 입니다")
    }
    println("===========================")
    for (b in 1..3) {
        println("너는 ${b}번째 입니다")
    }
    println("----------------------------")

    var infors = arrayOf("뱀", "도마뱀", "악어", "거북이", "카멜레온")
    for (info in infors) {
        if(info == "악어"){
        println("악어를 찾았습니다")
        break
      }  else {
         continue
      }
    }
}