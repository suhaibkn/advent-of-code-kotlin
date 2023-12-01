package aoc.helper

import java.io.BufferedReader
import java.io.File
import java.time.Year

private fun getFileBuffer(file: String): BufferedReader {
    return File(file).inputStream().bufferedReader()
}

public fun getInput(day: String, year: Int, file: String = "input"): BufferedReader {
    return getFileBuffer("src/main/resources/aoc$year/day$day/$file")
}

public fun getInput(day: String, file: String = "input"): BufferedReader {
    return getInput(day = day, year = Year.now().value, file = file)
}

public fun getInputFor2023(day: String, file: String = "input"): BufferedReader {
    return getInput(day = day, year = 2023, file = file)
}
