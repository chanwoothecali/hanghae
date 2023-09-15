package hanghae99.plus2.team3.health

import hanghae99.plus2.hanghae.health.HealthService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
@RestController
class CicdController(
    private val healthService: HealthService
) {

    @GetMapping("/health")
    fun healthCheck(): String {
        return "ok"
    }

    @GetMapping("/something")
    fun something(): String {
        return healthService.doSomething()
    }
}