package aoc.helper

import java.io.File

@Suppress("MemberVisibilityCanBePrivate", "unused")
abstract class Year(
    private val year: Int
) {
    protected var path = "src/main/resources"

    protected var mainInputFile = "input"

    protected var firstTestInputFile = "test01"

    protected var secondTestInputFile = "test02"

    protected val day: String = javaClass.simpleName.replace("Day", "")

    protected val mainInput: List<String> by lazy {
        File("$path/aoc${this.year}/day${this.day}/${this.mainInputFile}").readLines()
    }

    protected val firstTestInput: List<String> by lazy {
        File("$path/aoc${this.year}/day${this.day}/$firstTestInputFile").readLines()
    }

    protected val secondTestInput: List<String> by lazy {
        File("$path/aoc${this.year}/day${this.day}/$secondTestInputFile").readLines()
    }

    init {
        println("".padEnd(35, '*'))
        println("*  \uD83D\uDE80  Welcome to Day $day of $year  *")
        println("".padEnd(35, '*'))
    }

    abstract fun firstPart(): String
    abstract fun secondPart(): String

    fun runFirstPart(): Unit {
        println("The output of the first part is: ${this.firstPart()}")
    }

    fun runSecondPart(): Unit {
        println("The output of the second part is: ${this.secondPart()}")
    }

    fun runBothParts(): Unit {
        this.runFirstPart()
        this.runSecondPart()
    }

    fun run() = this.runBothParts()
}