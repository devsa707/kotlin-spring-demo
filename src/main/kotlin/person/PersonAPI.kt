package person

class PersonAPI {
    private val personDAO = PersonDAO()

    fun getAll(): List<PersonEntity> {
        return personDAO.getAll()
    }
}