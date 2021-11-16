import extensions.eachWithIndex
import extensions.endOfMonth
import extensions.mmDdHhMm
import extensions.months
import java.time.LocalDate
import java.time.LocalDateTime

fun main() {
    println(LocalDate.now().plus(10.months()))
    println(LocalDate.now().endOfMonth())
    println(LocalDateTime.now().endOfMonth())
    println(LocalDateTime.now().mmDdHhMm())
    10.eachWithIndex{ println(it) }
}
