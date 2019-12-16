package fr.hervedarritchon.studying.monadvsproxy.proxydp

import fr.hervedarritchon.studying.monadvsproxy.models.Customer

class AProxy : IAService {
    private val aService: AService = AService()

    override fun aMethod(message: String): String {
        println("AProxy.aMethod start")
        val result = aService.aMethod(message)
        println("AProxy.aMethod stop")
        return result
    }

    override fun anOtherMethod(isAvailable: Boolean): Customer {
        println("AProxy.anOtherMethod start")
        val result = aService.anOtherMethod(isAvailable)
        println("AProxy.anOtherMethod stop")
        return result
    }
}