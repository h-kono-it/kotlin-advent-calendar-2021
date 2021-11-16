package extensions

import java.time.Period


fun Int.days(): Period = Period.ofDays(this)

fun Int.day(): Period = days()

fun Int.months(): Period = Period.ofMonths(this)

fun Int.month(): Period = months()

fun Int.years(): Period = Period.ofYears(this)

fun Int.year(): Period = years()

fun Int.weeks(): Period = Period.ofWeeks(this)

fun Int.week(): Period = weeks()

fun Int.eachWithIndex(func : (index:Int) -> Unit) {
    repeat(this) { func(it) }
}
