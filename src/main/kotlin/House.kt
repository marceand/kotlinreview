abstract class House () {

    abstract fun isOpen(): Boolean

    abstract fun isClean(): Boolean

    open fun name() = "House"

}