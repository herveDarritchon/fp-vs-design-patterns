package fr.hervedarritchon.studying.monadvsproxy.monad

import fr.hervedarritchon.studying.monadvsproxy.models.Customer

/**
 * Created by Hervé Darritchon on 15/12/2019.
 *
 */
class AService {

    fun aMethod(message: String): String = message

    fun anOtherMethod(isAvailable: Boolean): Customer = if (isAvailable) {
        Customer("John", "Doe")
    } else {
        Customer("Jane", "Doe")
    }

}