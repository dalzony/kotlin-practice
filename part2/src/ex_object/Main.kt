package ex_object

fun main(args:Array<String>) {
    val person = object {
        val name:String = "이아무개"
        val age:Int = 31
    }

    println(person.name)
    println(person.age)

}
//45