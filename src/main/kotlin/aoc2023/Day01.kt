package aoc2023

import aoc.helper.Year

fun main() = Day01().run {
    runFirstPart()
    runSecondPart()
}

private class Day01 : Year(2023) {
    override fun firstPart(): String {
        return this.mainInput
            .map {
                it.split("").filter { e -> (0..9).contains(e.toIntOrNull()) }
            }
            .sumOf { (it.first() + it.last()).toInt() }
            .toString()
    }

    override fun secondPart(): String {
        return this.mainInput
            .map {
                it
                    .replace("one", "one1one")
                    .replace("two", "two2two")
                    .replace("three", "three3three")
                    .replace("four", "four4four")
                    .replace("five", "five5five")
                    .replace("six", "six6six")
                    .replace("seven", "seven7seven")
                    .replace("eight", "eight8eight")
                    .replace("nine", "nine9nine")
            }
            .map {
                it.split("").filter { e -> (0..9).contains(e.toIntOrNull()) }
            }
            .sumOf { (it.first() + it.last()).toInt() }
            .toString()
    }
}
