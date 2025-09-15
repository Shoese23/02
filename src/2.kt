fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""
    val charCountMap = mutableMapOf<Char, Int>()
    for (char in input) {
        charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
    }
    val sortedChars = charCountMap.keys.sorted()
    for (char in sortedChars) {
        println("$char - ${charCountMap[char]}")
    }
}