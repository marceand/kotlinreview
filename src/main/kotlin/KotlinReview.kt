fun main(args: Array<String>) {

    whenExpression("Marcelino")

    forLoop(intArrayOf(1,2,3,4,5,6))

    runningFunction{x,y -> x+y}
    runningFunction{x,y -> x*y}

    runFunctionExtension()

    runGenericExtension()

    runExtensionProperty()
}

fun runExtensionProperty() {
    val numberOfVowels = "Marcelino".numVowels
    println("Numbers of vowels is: $numberOfVowels")

}

fun runGenericExtension() {

    val name = "Marcelino Yax"
    val age = 20
    val result = age.concatenate(name)
    println(result)
}
fun <T> T.concatenate(input: T): String {
   return "$input is $this"
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

fun forLoop(array: IntArray) {

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

val String.numVowels
    get() = count { "aeiou".contains(it) }


