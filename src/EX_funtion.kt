fun main(args: Array<String>):Unit
{
    println(myFunction())
    println(myFunction() + 10 )

    println(testFun())
    println(testFun3())
}

fun myFunction():Int
{
    val a = 3
    val b = 6
    println("a:" + a + ",b" +b)

    return a+b
}

fun testFun():Double
{
    return  1.0 +1.0;
}

fun testFun2():Double = 3.0 + 7

fun testFun3() = 3.0 + 8