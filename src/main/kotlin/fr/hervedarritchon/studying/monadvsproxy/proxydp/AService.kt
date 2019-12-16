package fr.hervedarritchon.studying.monadvsproxy.proxydp

import fr.hervedarritchon.studying.monadvsproxy.models.Customer

/**
 * Created by Hervé Darritchon on 15/12/2019.
 *
 */
class AService : IAService {

    override fun aMethod(message: String): String = message

    override fun anOtherMethod(isAvailable: Boolean): Customer = if (isAvailable) {
        Customer("John", "Doe")
    } else {
        Customer("Jane", "Doe")
    }
}