import aoc.helper.Year

private class Day00 : Year(2023) {
    // Make sure three input files exist at
    // src/main/resources/aoc{year}/day{00}/{input,test01,test02}
    override fun firstPart(): String {
        // return this.mainInput
        // return this.firstTestInput
        return "part 01"
    }

    override fun secondPart(): String {
        // return this.mainInput
        // return this.secondTestInput
        return "part 02"
    }
}

fun main() {
    Day00().run {
        runFirstPart()
        runSecondPart()
    }
}