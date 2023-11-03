package basic

val popcorn = 5
var hotdog = 7
fun main() {
    println("Hello, world!")

//    popcorn = 50  // val 변수는 쓰기가 불가능
    hotdog = 70
    println(hotdog)

    printNumber()
    printStringTemplates()
}

fun printNumber() {
    println(popcorn)
    println(hotdog)
}

fun printStringTemplates() {
    println("핫도그를 $hotdog 개 시켰다.")
    println("핫도그를 ${hotdog}개 시켰다.")
    println("핫도그를 ${hotdog + 10}개 시켰다.")
}