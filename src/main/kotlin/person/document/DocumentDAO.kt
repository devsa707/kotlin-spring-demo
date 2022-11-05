package person.document

class DocumentDAO {
    fun getAll(PersonId: Int): List<DocumentEntity> {
        val documentList = mutableListOf<DocumentEntity>()
        when (PersonId) {
            1 -> {
                val documentEntity1 = DocumentEntity(1, "RG Frente Samuel")
                documentList.add(documentEntity1)
                val documentEntity2 = DocumentEntity(2, "RG Verso Samuel")
                documentList.add(documentEntity2)
            }
            2 -> {
                val documentEntity1 = DocumentEntity(3, "RG Frente Teste")
                documentList.add(documentEntity1)
                val documentEntity2 = DocumentEntity(4, "RG Verso Teste")
                documentList.add(documentEntity2)
            }
        }
        return documentList
    }
}