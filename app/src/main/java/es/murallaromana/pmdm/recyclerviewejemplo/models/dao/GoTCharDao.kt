package es.murallaromana.pmdm.recyclerviewejemplo.models.dao

import es.murallaromana.pmdm.recyclerviewejemplo.models.entities.GoTChar


interface GoTCharDao {
    fun getAllChars(): List<GoTChar>
}