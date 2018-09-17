package ex_upcasting

open class Person(val name:String, val age:Int)

class Student(name:String,age:Int,val id:Int):Person(name,age)

fun main(args:Array<String>)
{
    val person:Person = Student("MS", 32,20171218)
}
//65