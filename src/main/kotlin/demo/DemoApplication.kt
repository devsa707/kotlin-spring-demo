package demo

import org.apache.logging.log4j.message.Message
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import person.PersonDTO
import person.PersonAPI
import person.PersonDocumentAPI
import person.document.DocumentAPI

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

@RestController
@RequestMapping("api/person")
class PersonController {
    @GetMapping("hello")
    fun hello(): List<PersonDTO> {
        val personDocumentAPI = PersonDocumentAPI()
        return personDocumentAPI.getAll()
    }

    @PostMapping
    fun post(@RequestBody message: Message) {
    }
}