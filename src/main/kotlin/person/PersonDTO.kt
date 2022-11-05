package person


class PersonDocumentDTO(
    val name: String = ""
)

class PersonDTO(
    val name: String = "",
    var age: Int = 0,
    val phone: String = ""
) {
    var documents=  mutableListOf<PersonDocumentDTO>()
}