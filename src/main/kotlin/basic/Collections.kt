package basic

fun main() {
    val readOnly = listOf("triangle", "square", "circle")
    // readOnly.add("test") // 불가능
    println(readOnly)

    val mutable: MutableList<String> = mutableListOf("triangle", "square", "circle")
    mutable.add("test")
    mutable.remove("test")
    println(mutable)

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes.add("test")
    val shapesLocked: List<String> = shapes
    // shapesLocked.add("test")

    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("The first item in the list is: ${readOnlyShapes[0]}")
    println("The first item in the list is: ${readOnlyShapes.first()}")
    println("The last item in the list is: ${readOnlyShapes.last()}")
    println("This list has ${readOnlyShapes.count()} items")
    println("circle" in readOnlyShapes)

    val readOnlySet = setOf("apple", "banana", "cherry", "cherry")
    val mutableSet: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlySet)
    println("This set has ${readOnlySet.count()} items")

    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")

    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    juiceMenu["coconut"] = 150
    juiceMenu.put("melon", 200)
    juiceMenu.remove("orange")
    println(juiceMenu)

    println(readOnlyJuiceMenu.containsKey("kiwi"))

    println(readOnlyJuiceMenu.keys)
    println("orange" in readOnlyJuiceMenu.keys)

    println(readOnlyJuiceMenu.values)
    println(200 in readOnlyJuiceMenu.values)
}