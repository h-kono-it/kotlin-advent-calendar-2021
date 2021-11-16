package extensions

import java.time.Duration
import java.time.Period


fun Int.days(): Period = Period.ofDays(this)

fun Int.day(): Period = days()

fun Int.months(): Period = Period.ofMonths(this)

fun Int.month(): Period = months()

fun Int.years(): Period = Period.ofYears(this)

fun Int.year(): Period = years()

fun Int.weeks(): Period = Period.ofWeeks(this)

fun Int.week(): Period =  weeks()

// Int.hours（プロパティ）はkotlinで実装済みだが戻り値の型が`kotlin.time.Duration`
// このkotlin.time.Durationはexperimentalな機能なためJavaのDurationを使用する拡張関数を定義する
// また、拡張プロパティとして定義する場合、別の名前をつける必要がある
fun Int.hours(): Duration = Duration.ofHours(this.toLong())
fun Int.hour(): Duration = hours()

fun Int.minutes(): Duration = Duration.ofMinutes(this.toLong())
fun Int.minute(): Duration = minutes()

fun Int.seconds(): Duration = Duration.ofSeconds(this.toLong())
fun Int.second(): Duration = seconds()

fun Int.eachWithIndex(func : (index:Int) -> Unit) {
    repeat(this) { func(it) }
}
