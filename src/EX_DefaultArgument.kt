fun main(args: Array<String>)
{
    println(getAverage(89, 96))
    getAverage(100, 50, true)
    println(getAverage(90))
    getAverage(66,print=true)
    getAverage(print = true)
    getAverage(print = true, a=10, b=30)
    //getAverage(a=10,30,print=true) 요렇게 하면 실행이 안된다. 지정할 인수는 오른쪽에
}

fun getAverage(a:Int = 0, b:Int = 0, print:Boolean = false):Double
{
    val result = (a + b)/2.0
    if(print)
        println(result)
    return result
}