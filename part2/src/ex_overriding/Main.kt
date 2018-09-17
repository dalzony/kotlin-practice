package ex_overriding

open class AAA
{
    open fun func() = println("AAA") //open을 써야 오버라이딩이 가능
    open fun testadd() = println("AAAadd") //테스트용
}

class BBB:AAA()
{
    override fun func() //overrice를 써야함
    {
        super.func()
        println("BBB")
    }

    //override fun testadd() = println("BBBADD") 테스트용
}

fun main(args:Array<String>)
{
    AAA().func()
    println("------------------")
    BBB().func()
    BBB().testadd()
}

// 한번 override 되면 하위에서 계속 오버라이딩 가능하므로, 막으려면 final을 사용
//66