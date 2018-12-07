interface Animal {

    val name: String

    fun isEating(): Boolean

    fun isWalking(): Boolean

    fun name(): String{
        return "My name is $name"
    }
}