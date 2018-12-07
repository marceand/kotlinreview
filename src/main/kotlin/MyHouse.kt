class MyHouse : House() {

    override fun isOpen(): Boolean = false

    override fun isClean(): Boolean = false

    override fun name() = "My house"
}