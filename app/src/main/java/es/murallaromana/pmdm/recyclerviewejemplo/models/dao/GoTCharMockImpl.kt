package es.murallaromana.pmdm.recyclerviewejemplo.models.dao

import es.murallaromana.pmdm.recyclerviewejemplo.models.entities.GoTChar

class GoTCharMockImpl : GoTCharDao {
    override fun getAllChars(): List<GoTChar> =
        listOf(
            GoTChar(0, "Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen"),
            GoTChar(1, "Samwell", "Tarly", "Maester", "House Tarly"),
            GoTChar(2, "Arya", "Stark", "No One", "House Stark"),
            GoTChar(3, "Brienne", "Tarth", "Briene of Tarth", "Tarth")
        )

}