package toy.projects.draftmasterserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DraftMasterServerApplication

fun main(args: Array<String>) {
    runApplication<DraftMasterServerApplication>(*args)
}
