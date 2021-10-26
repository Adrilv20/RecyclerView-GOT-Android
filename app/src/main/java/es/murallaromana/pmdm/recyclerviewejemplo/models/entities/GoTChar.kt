package es.murallaromana.pmdm.recyclerviewejemplo.models.entities

class GoTChar(
    var id: Long,
    var firstName: String,
    var lastName: String,
    var title: String,
    var family: String,
    var imageUrl: String
    ) {
    fun fullName() : String = "${firstName} ${lastName}"
}