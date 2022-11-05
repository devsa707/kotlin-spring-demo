package person.document

import person.PersonDTO
import person.PersonDocumentDTO

class DocumentAdapter {
    fun addPersonDocuments(PersonDTO: PersonDTO, Documents: List<DocumentEntity>) {
        for (documentEntity in Documents) {
            val personDocumentDTO = PersonDocumentDTO(
                documentEntity.Name
            )
            PersonDTO.documents.add(personDocumentDTO)
        }
    }
}