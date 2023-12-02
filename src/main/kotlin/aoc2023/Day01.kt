package aoc2023

import aoc.helper.getInputFor2023
import java.util.stream.Stream

fun main() {
    print("Output for Part 1: ")
    part1()

    print("Output for Part 2: ")
    part2()
}

private fun part1() {
    getInputForDay01()
        .map {
            it.split("").filter { e -> (0..9).contains(e.toIntOrNull()) }
        }
        .mapToInt { (it.first() + it.last()).toInt() }
        .sum()
        .run(::println)
}

private fun part2() {
    getInputForDay01()
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
        .mapToInt { (it.first() + it.last()).toInt() }
        .sum()
        .run(::println)
}

private fun getInputForDay01(): Stream<String> = getInputFor2023("01").lines()
