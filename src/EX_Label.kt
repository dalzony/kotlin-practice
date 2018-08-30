fun main(args: Array<String>):Unit
{
    var x = 0
    var y = 0

    outer@ while ( x <= 20)
    {
        y = 0
        while (y <= 20)
        {
            if(x + y == 15 && x - y ==5)
                break@outer

            y+=1
        }
        x += 1
    }

    println("x: $x, y: $y")
}

/* 두개의 while문을 모두 거치는 케이스
fun main(args:Array<String>):Unit
{
    var x = 0
    var y = 0

    while (x <= 20)
    {
        y = 0
        while ( y <= 20)
        {
            if(x + y == 15 && x - y == 5)
                break
            y += 1
        }
        x += 1
    }

    println("x:$x, y:$y")
    //x: 21, y:21
}
*/

//29