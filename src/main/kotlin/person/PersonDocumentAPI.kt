package person

import person.document.DocumentAPI
import person.document.DocumentAdapter

class PersonDocumentAPI {
    private val personAPI = PersonAPI()
    private val documentAPI = DocumentAPI()
    private val personAdapter = PersonAdapter()
    private val documentAdapter = DocumentAdapter()

    fun getAll(): List<PersonDTO> {
        val listPersonDTO = mutableListOf<PersonDTO>()
        val listPersonEntity = personAPI.getAll()
        for (personEntity in listPersonEntity) {
            listPersonDTO.add(
                personAdapter.generatePersonDTO(personEntity)
            )
            val listDocumentsEntity = documentAPI.findAll(personEntity.id)
            documentAdapter.addPersonDocuments(listPersonDTO.last(), listDocumentsEntity)
        }
        return listPersonDTO
    }
}