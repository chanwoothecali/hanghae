package hanghae99.plus2.team3.health

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
@RestController
class CicdController(
    private val cicdService: CicdService
) {

    @GetMapping("/health")
    fun healthCheck(): String {
        return "ok"
    }
}