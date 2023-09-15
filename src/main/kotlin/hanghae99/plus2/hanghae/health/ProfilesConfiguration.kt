package hanghae99.plus2.hanghae.health

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
class ProfilesConfiguration {

    @Profile("test")
    @Bean
    fun test(): SuccessHealthService {
        return SuccessHealthService()
    }
}