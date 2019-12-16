package fr.hervedarritchon.studying.monadvsproxy.monad

class Logged constructor(private val aService: AService) {

    companion object {
        fun just(aService: AService): Logged = Logged(aService)
    }

    fun fMap(block: AService.() -> Unit) {
        println("Logged.fMap start with $block")
        aService.block()
        println("Logged.fMap stop with $block")
    }
}