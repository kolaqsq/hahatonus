package com.example.wetro

object ScheduleHolder {
    private val  scheduleCount = arrayOf(
        "через 1ч 53м",
        "через 1ч 53м",
        "через 1ч 53м",
        "через 1ч 53м",
        "через 1ч 53м",
        "через 1ч 53м",
        "через 1ч 53м",
        "через 1ч 53м",

    )

    private val  scheduleTimeIn = arrayOf(
        "19:54",
        "19:54",
        "19:54",
        "19:54",
        "19:54",
        "19:54",
        "19:54",
        "19:54",
    )
    private val  scheduleCountMin = arrayOf(
        "28 мин",
        "28 мин",
        "28 мин",
        "28 мин",
        "28 мин",
        "28 мин",
        "28 мин",
        "28 мин",
    )
    private val  scheduleTimeOut = arrayOf(
        "20:22",
        "20:22",
        "20:22",
        "20:22",
        "20:22",
        "20:22",
        "20:22",
        "20:22",
    )
    private val scheduleRoute = arrayOf(
        "Клин - Москва",
        "Клин - Москва",
        "Клин - Москва",
        "Клин - Москва",
        "Клин - Москва",
        "Клин - Москва",
        "Клин - Москва",
        "Клин - Москва",
    )


    fun createCollectionSchedule(): List<Schedule> {
        val schedules = mutableListOf<Schedule>()
        for (i in 0..12){
            val schedule = Schedule(
                timeIn = scheduleTimeIn[0],
                timeOut = scheduleTimeOut[0],
                route = scheduleRoute[0],
                count = scheduleCount[0],
                countMin = scheduleCountMin[0],
            )
            schedules.add(schedule)
        }
        return schedules
    }
}

data class Schedule(
    val timeIn: String,
    val timeOut: String,
    val route: String,
    val count: String,
    val countMin: String,
)