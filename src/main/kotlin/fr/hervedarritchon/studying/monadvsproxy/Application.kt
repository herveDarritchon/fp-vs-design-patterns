package fr.hervedarritchon.studying.monadvsproxy

import fr.hervedarritchon.studying.monadvsproxy.monad.AService
import fr.hervedarritchon.studying.monadvsproxy.monad.Logged
import fr.hervedarritchon.studying.monadvsproxy.proxydp.AProxy

/**
 * Created by Hervé Darritchon on 15/12/2019.
 *
 */
fun main() {
    //GandOfFours Proxy Design Pattern
    val aProxy = AProxy()
    println("aMethord = ${aProxy.aMethod("Hello")}")
    println("anOtherMethord = ${aProxy.anOtherMethod(true)}")

    val monad = Logged.just(AService())

    monad.fMap {
        this.aMethod("toto monad")
    }

    monad.fMap {
        this.anOtherMethod(false)
    }
}