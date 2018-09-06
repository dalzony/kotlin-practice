fun main(args:Array<String>):Unit
{
    celsiusToFah(27)
    inlineCelsius(27)

}

fun celsiusToFah(celsius:Int):Unit
{
    println(celsius * 1.8 + 32)
}

fun inlineCelsius(celsius: Int) = println(celsius * 1.8 + 32)
//32