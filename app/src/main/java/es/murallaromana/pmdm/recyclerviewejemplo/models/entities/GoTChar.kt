package es.murallaromana.pmdm.recyclerviewejemplo.models.entities

import java.io.Serializable

class GoTChar(
    var id: Long,
    var firstName: String,
    var lastName: String,
    var title: String,
    var family: String,
    var imageUrl: String = ""
    ) : Serializable {
    fun fullName() : String = "${firstName} ${lastName}"
}