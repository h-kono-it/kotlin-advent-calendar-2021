package extensions

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.temporal.TemporalAdjusters


private val YYYY_MM_DD_WITH_SLASH_FORMAT = DateTimeFormatter.ofPattern("yyyy/MM/dd")
private val YYYY_MM_DD_HH_MM_SS_WITH_SLASH_FORMAT = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")
private val MM_DD_HH_MM_FORMAT = DateTimeFormatter.ofPattern("M月d日 HH:mm")
fun LocalDate.beginningOfMonth(): LocalDate = with(TemporalAdjusters.firstDayOfMonth())

fun LocalDate.endOfMonth(): LocalDate = with(TemporalAdjusters.lastDayOfMonth())

fun LocalDate.yyyyMmDd(): String = format(YYYY_MM_DD_WITH_SLASH_FORMAT)

fun LocalDate.defaultFormat(): String = yyyyMmDd()

fun LocalDateTime.beginningOfMonth(): LocalDateTime = with(TemporalAdjusters.firstDayOfMonth())

fun LocalDateTime.endOfMonth(): LocalDateTime = with(TemporalAdjusters.lastDayOfMonth()).with(LocalTime.MAX)

fun LocalDateTime.yyyyMmDd(): String = format(YYYY_MM_DD_WITH_SLASH_FORMAT)
fun LocalDateTime.yyyyMmDdHhMmSs(): String = format(YYYY_MM_DD_HH_MM_SS_WITH_SLASH_FORMAT)
fun LocalDateTime.mmDdHhMm(): String = format(MM_DD_HH_MM_FORMAT)

fun LocalDateTime.defaultFormat(): String = yyyyMmDdHhMmSs()
