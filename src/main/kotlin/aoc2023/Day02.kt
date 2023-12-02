@file:Suppress("unused")

package aoc2023

import java.io.File

fun main() {
    print("Output for Part 1: ")
    part1()

    print("Output for Part 2: ")
    part2()
}

private fun part1() {
    File("src/main/resources/aoc2023/day02/input")
        .readLines()
        .asSequence()
        .map { Game(it) }
        .filter { it.possible }
        .sumOf { it.number }
        .run(::println)
}

private fun part2() {
    File("src/main/resources/aoc2023/day02/input")
        .readLines()
        .asSequence()
        .map { Game(it) }
        .sumOf { it.power }
        .run(::println)
}

private class Game(val game: String) {
    private val portions = this.game.split(": ")

    val number: Int = portions.first().replace("Game ", "").toInt()

    val sets: List<Set> = portions.last().split("; ").map { Set(it) }

    val reds: Int = this.sets.sumOf { it.red }
    val greens: Int = this.sets.sumOf { it.green }
    val blues: Int = this.sets.sumOf { it.blue }

    val minReds: Int = this.sets.maxOf { it.red }
    val minGreens: Int = this.sets.maxOf { it.green }
    val minBlues: Int = this.sets.maxOf { it.blue }

    val power: Int = minReds * minGreens * minBlues

    val possible = this.sets.fold(true) { acc, set -> acc && set.possible }
}

private class Set(val round: String) {
    val items: List<String> = this.round.split(", ")

    val red = this.items
        .filter { it.endsWith(" red") }
        .sumOf { it.replace(" red", "").toInt() }

    val green = this.items
        .filter { it.endsWith(" green") }
        .sumOf { it.replace(" green", "").toInt() }

    val blue = this.items
        .filter { it.endsWith(" blue") }
        .sumOf { it.replace(" blue", "").toInt() }

    val possible = (this.red <= 12) && (this.green <= 13) && (this.blue <= 14)
}
