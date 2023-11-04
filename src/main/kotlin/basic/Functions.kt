package basic

fun main() {
    hello()

    println(sum(10, 20))
    println(sum(y = 20, x = 10))

    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")

//    printMessageWithPrefixTwo("log")
    printMessageWithPrefixTwo(prefix = "log")

    println(multiplication(5, 3))

    println({ string: String -> string.uppercase() }("hello"))

    val upperCaseString = { string: String -> string.uppercase() }
    println(upperCaseString("hello"))

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }

    println(positives)
    println(negatives)

    // 람다식을 리턴하는 함수
    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")
}

fun hello() {
    return println("Hello, world!")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun printMessageWithPrefixTwo(message: String = "Hello", prefix: String) {
    println("[$prefix] $message")
}

fun multiplication(x: Int, y: Int) = x * y

fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}