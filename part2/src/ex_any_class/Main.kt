package ex_any_class

fun main(array: Array<String>)
{
    val building = Building("코틀린", area = 100)
    printObject(building)
}

fun printObject(any:Any)
{
    println(any.toString())
}
//70