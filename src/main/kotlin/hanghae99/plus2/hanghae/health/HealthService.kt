package hanghae99.plus2.hanghae.health

interface HealthService {

    fun doSomething(): String
}

class SuccessHealthService() : HealthService {

    override fun doSomething(): String {
        return "something finished"
    }
}