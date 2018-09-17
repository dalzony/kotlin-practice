package ex_inheritance

open class Person(val name:String, val age:Int)

/*
class Student(name: String, age:Int, val id:Int): Person(name,age)

*/
open class Student(name: String, age:Int, val id:Int): Person(name,age)
open class Teacher(name: String, age:Int, id:Int, subject: String):Student(name,age,id)

fun main(args:Array<String>) {
    val person = Person("lee", 35)
    val student = Student("kim", 23,20171217)
    val teacher = Teacher("mk", 40, 302304, subject = "eng")
}
//64 구리지만; Student도 상속이 가능한 클래스로 바꿔