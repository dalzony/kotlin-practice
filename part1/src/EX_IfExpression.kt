fun main(args:Array<String>): Unit
{
    val value:Int = if (10 > 5)
    {
        println("10은 5보다 크다")
        10
    } else
    {
        println("10은 5보다 크지 않다")
        5
    }

    println(value)

    val b = if(10 > 5)
    {
        val a = 10
    }
    else
    {
        val a = 5
    }

    println("b:" + b)
}
//22

