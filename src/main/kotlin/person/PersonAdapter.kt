package person

import java.time.LocalDate
import java.time.Period

class PersonAdapter {
    fun generatePersonDTO(PersonEntity: PersonEntity): PersonDTO {
        return PersonDTO(
            PersonEntity.name,
            Period.between(
                PersonEntity.birthDay,
                LocalDate.now()
            ).years,
            PersonEntity.phone
        )
    }
}