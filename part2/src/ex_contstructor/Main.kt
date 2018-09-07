package ex_contstructor

class Person constructor(var name: String, age: Int) {
    val name: String
    val age: Int

    init { // 굳이 이니셜 블록을 쓰는 이유는 뭘까
        this.name = name
        this.age = age
    }
}

fun main(args:Array<String>) {
    val person = Person("홍길동", 46)
    println("이름 ${person.name}")
    println("나이 ${person.age}")
    println
}

// 54