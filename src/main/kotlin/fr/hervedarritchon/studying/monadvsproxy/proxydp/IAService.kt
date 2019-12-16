package fr.hervedarritchon.studying.monadvsproxy.proxydp

import fr.hervedarritchon.studying.monadvsproxy.models.Customer

/**
 * Created by Hervé Darritchon on 15/12/2019.
 *
 */
interface IAService {
    fun aMethod(message: String) : String
    fun anOtherMethod(isAvailable: Boolean): Customer
}