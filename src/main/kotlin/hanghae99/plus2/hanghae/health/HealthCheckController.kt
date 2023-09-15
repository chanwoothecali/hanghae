package hanghae99.plus2.hanghae.health

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
@RestController
class HealthCheckController(
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