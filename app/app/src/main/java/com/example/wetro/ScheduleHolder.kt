package com.example.wetro

object ScheduleHolder {
    private val scheduleCount = arrayOf(
        "через 13м",
        "через 40м",
        "через 1ч 20м",
        "через 1ч 53м",
        "через 2ч 22м",
    )

    private val scheduleTimeIn = arrayOf(
        "14:22",
        "14:49",
        "15:54",
        "16:22",
        "17:12",
    )
    private val scheduleCountMin = arrayOf(
        "28 мин",
        "26 мин",
        "24 мин",
        "32 мин",
        "40 мин",
    )
    private val scheduleTimeOut = arrayOf(
        "14:50",
        "15:15",
        "16:12",
        "16:44",
        "17:12",
    )
    private val scheduleRoute = arrayOf(
        "Причал 1 - Причал 4",
        "Причал 1 - Причал 4",
        "Причал 1 - Причал 4",
        "Причал 1 - Причал 4",
        "Причал 1 - Причал 4",
    )


    fun createCollectionSchedule(): List<Schedule> {
        val schedules = mutableListOf<Schedule>()
        for (i in 0..4) {
            val schedule = Schedule(
                timeIn = scheduleTimeIn[i],
                timeOut = scheduleTimeOut[i],
                route = scheduleRoute[i],
                count = scheduleCount[i],
                countMin = scheduleCountMin[i],
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