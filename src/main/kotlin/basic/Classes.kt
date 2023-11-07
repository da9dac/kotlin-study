package basic

// https://kotlinlang.org/docs/data-classes.html

class ContactA(val id: Int, var email: String)
class ContactB(val id: Int, var email: String) {
    val category: String = "test"
}

class MyFunction(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }

    fun printEmail() {
        println(email)
    }
}

data class User(val name: String, val id: Int)

fun main() {
    val a = ContactA(1, "aaaa@email.com")

    println(a)
    println(a.id)
    println(a.email)

    val b = ContactB(1, "bbbb@email.com")

    println(b)
    println(b.id)
    println(b.email)
    println(b.category)

    a.email = "newaaaa@email.com"
    b.email = "newbbbb@email.com"

    val myFunction = MyFunction(1234, "my@email.com")

    myFunction.printId()
    myFunction.printEmail()

    val user = User("da9dac", 1234)

    println(user)

    val firstUser = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("firstUser == secondUser: ${firstUser == secondUser}")
    println("firstUser == thirdUser: ${firstUser == thirdUser}")

    println(user.copy())
    println(user.copy(name = "Max"))
    println(user.copy(id = 3))

    println(user == user.copy())
    println(user == user.copy(name = "Max"))
    println(user == user.copy(id = 3))
}