fun main(args: Array<String>) {

    whenExpression("Marcelino")

    forloop(intArrayOf(1,2,3,4,5,6))

    runningFunction{x,y -> x+y}
    runningFunction{x,y -> x*y}

    runFunctionExtension()
    runGenericExtension()
}

fun runGenericExtension() {


}

fun runFunctionExtension() {
    val firstName = "Marcelino"
    val lastName = "Yax"
    val name = firstName.addLastName(lastName)
    println(name)
}

fun runningFunction(predicate: (Int, Int) -> Int) {
    val result = predicate(3, 4)
    println("the result is $result")
}

fun whenExpression(name: String){
    val profession = when(name){
        "Marcelino" -> "android developer"
        "John" -> "javascript developer"
        "Kevin" -> "ios developer"
        else -> "no profession"
    }

    println("$name profession is $profession")
}

fun forloop(array: IntArray) {

    for(element in array){
        println(element)
    }

    for(i in array.indices){
        println(array[i])
    }

    for (i in 0..4) {
        println(i)
    }
}


fun String.addLastName(secondValue: String = ""): String{
    return "$this  $secondValue"
}


