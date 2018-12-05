fun main(args: Array<String>) {

//    whenExpression("Marcelino")
//
//    forLoop(intArrayOf(1,2,3,4,5,6))
//
//    runningFunction{x,y -> x+y}
//    runningFunction{x,y -> x*y}
//
//    runFunctionExtension()
//
//    runGenericExtension()
//
//    runExtensionProperty()
//
//    runNullSafetyOperator()
//
//    runFilterFunction()

//    runObjectDeclaration()

//    runCompanionObject()
//
//    runObjectExpression()

    runSealedOperation()
}

fun runSealedOperation() {
    val result = sealedOperation(3, Operation.Add(4))
    println(result)
}

fun sealedOperation(x: Int, op: Operation) = when (op) {
    is Operation.Add -> x + op.value
    is Operation.Substract -> x - op.value
    is Operation.Multiply -> x * op.value
    is Operation.Divide -> x / op.value
}

fun runObjectExpression() {
    // declaring an anonymous object
    val dog = object: Dog(){
        override fun pray() = println("Dog does not pray")
    }

    dog.pray()
}

fun runCompanionObject() {
    Person.callMe()
}

fun runObjectDeclaration() {
    val list = listOf(3,4,5,6,7,1,0)
    val sortedArray = AlgorithmManager.sortAlgorithm(list)
    println(sortedArray)

    val twiceArray = AlgorithmManager.multiplyTwice(sortedArray)
    println(twiceArray)

}

fun runFilterFunction() {
    val integerList = listOf(1,3,4,4,2,2)
    val filteredList = integerList.filter {it % 2 == 0 }
    println(filteredList)
}

fun runNullSafetyOperator() {
    var beverage: String ?= null
    var print = beverage ?: "no beverage"
    println(print)

    val name = getName()
    val length = name?.length ?: -1
    println(length)
}

fun getName(): String?{
    return null
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

object AlgorithmManager{

    fun sortAlgorithm(input: List<Int>): List<Int> {
       return input.sortedDescending()
    }

    fun multiplyTwice(input: List<Int>): List<Int> {
        return input.map { 2*it }
    }
}

class Person {
    companion object{
        fun callMe() = println("I'm called.")
    }
}

class Car {
    companion object{
        fun createInstance() = Car()
    }
}

open class Dog() {
    fun eat() = println("Eating food.")

    fun talk() = println("Talking with people.")

    open fun pray() = println("Praying god.")
}



