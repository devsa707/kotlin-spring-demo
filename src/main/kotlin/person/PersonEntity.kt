package person

import java.time.LocalDate


data class PersonEntity(
    var id: Int,
    var name: String = "",
    var phone: String = "",
    var birthDay: LocalDate = LocalDate.of(1000, 1, 1)
)
