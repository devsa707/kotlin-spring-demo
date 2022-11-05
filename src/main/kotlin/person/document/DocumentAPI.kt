package person.document;

class DocumentAPI {
    private val documentDAO = DocumentDAO()
    fun findAll(PersonId: Int): List<DocumentEntity> {
        return documentDAO.getAll(PersonId)
    }
}
