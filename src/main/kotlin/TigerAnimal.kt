class TigerAnimal() : Animal{

    override val name: String = "Pedro"

    override fun isEating(): Boolean = true

    override fun isWalking(): Boolean = true

    override fun name(): String = "the name is $name"
}