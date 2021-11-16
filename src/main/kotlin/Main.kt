import extensions.*
import java.time.LocalDate
import java.time.LocalDateTime

fun main() {
    println(LocalDate.now().plus(10.months()).yyyyMmDd())
    println(LocalDate.now().endOfMonth())
    println(LocalDateTime.now().endOfMonth())
    println(LocalDateTime.now().mmDdHhMm())
    10.eachWithIndex{ println(it) }
}
