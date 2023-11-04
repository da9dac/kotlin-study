package basic

fun main() {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    println(if (check) 1 else 2)
    val min = if (100 < 200) 100 else 200
    println(min)

    val obj = "Hello"

    when (obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }

    val temp = 18

    val description = when {
        temp < 0 -> "very cold"
        temp < 10 -> "a bit cold"
        temp < 20 -> "warm"
        else -> "hot"
    }
    println(description)

    for (number in 1..5) {
        print(number)
    }

    println()

    for (number in 1..<5) {
        print(number)
    }

    println()

    for (number in 1..<5) {
        print(number)
    }

    println()

    for (number in 5 downTo 1) {
        print(number)
    }

    println()

    for (number in 1..5 step 2) {
        print(number)
    }

    println()

    for (number in 5 downTo 1 step 2) {
        print(number)
    }

    println()

    for (ch in 'a'..'z') {
        print(ch)
    }

    println()

    for (ch in 'z' downTo 'a' step 2) {
        print(ch)
    }

    println()

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}