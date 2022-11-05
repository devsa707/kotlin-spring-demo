package person

import java.time.LocalDate

class PersonDAO {
    fun getAll(): List<PersonEntity> {
        return montarLista()
    }


    private fun montarLista(): List<PersonEntity> {
        val listPersonEntity = mutableListOf<PersonEntity>()
        val personEntity1 = PersonEntity(1, "Samuel", "4299999999", LocalDate.of(1996, 10, 9))
        listPersonEntity.add(personEntity1)
        val personEntity2 = PersonEntity(2, "Test2", "4222222222", LocalDate.of(2000, 5, 9))
        listPersonEntity.add(personEntity2)
        listPersonEntity.add(personEntity2)
        listPersonEntity.add(personEntity2)
        listPersonEntity.add(personEntity2)
        return listPersonEntity
    }
}
