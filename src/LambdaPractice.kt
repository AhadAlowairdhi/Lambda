fun main(){
    data class Players(val name: String, val age:Int, val height :Double)

    val   players = listOf(
        Players("Omar",25,165.0),
        Players("Khalid",30,173.0),
        Players("Mohammed",29,165.0),
        Players("Abdullah",22,166.0),
        Players("Saad",25,165.0),
        Players("Faisal",33,170.0),
        Players("Ahmed",29,165.0),
        Players("Ali",23,177.0),
        Players("Fahad",25,169.0),
        Players("Rashid",26,180.0),
        Players("Talal",25,165.0),
        Players("Nasser",27,161.0),
        Players("Aziz",31,165.0),
        Players("Anas",25,175.0),
        Players("Naif",21,177.0),
        Players("Rakan",32,162.0),
        Players("Qasim",28,166.0),
        Players("Sultan",25,180.0),
        Players("Nawaf",30,171.0),
        Players("Feras",34,170.0)
    )
    val highestMan  = players.maxByOrNull { it.height }
    println("The Highest Man is : ${highestMan!!.name} ")

    val olderMan = players.find {
        it.age >= 30
    }
    println("The older man is: ${olderMan!!.name} his age: ${olderMan!!.age}")

    val highestMen = players.filter {
        it.height >= 170.0
    }
    println("The tallest Men:")
    highestMen.forEach{
        println(it.name)
    }

    //one function (with no parameters)

    //Function
    fun getAdviceFun(){
        println("you can do it")
    }
    getAdviceFun()
    //Lambda
    val getAdvice = { println("If you fall seven, get up eight") }
    getAdvice()
    // two functions that take in one or more parameters
    //Function
    fun greetingFun( name: String ) : String{
        println("Hello $name!")
        return name
    }
    greetingFun("Ahad")

    //Lambda
    val greeting = {name:String -> println("Hi $name!")}
    greeting("Noura")

    //two functions that return a value
    //Function
    fun sumFun(x : Int, y : Int) : Int{
        var result = x + y
        println(result)
        return result
    }
   sumFun(2,7)

    //Lambda
    val sum = {x: Int,y: Int -> x+y }
    println(sum(6,9))
}