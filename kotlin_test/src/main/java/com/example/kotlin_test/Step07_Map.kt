package com.example.kotlin_test

fun main() {
    // 수정 불가능한 Map
    val mem = mapOf<String,Any>("num" to 1, "name" to "김구라", "isMan" to true)

    val num = mem.get("num")
    val name = mem.get("name")
    val isMan = mem.get("isMan")

    val num2 = mem["num"]
    val name2 = mem["name"]
    val isMan2 = mem["isMan"]

    // 수정 가능한 Map
    val mem2 = mutableMapOf<String, Any>()
    // 빈 Map 에 데이터 넣기 방법 1
    mem2.put("num",2)
    mem2.put("name","해골")
    mem2.put("isMan", false)

    val mem3 : MutableMap<String, Any> = mutableMapOf()

    // 빈 Map 에 데이터 넣기 방법 2
    mem3["num"] = 3
    mem3["name"] = "원숭이"
    mem3["isMan"] = true

}