package basic

fun main() {
    var neverNull: String = "널이 될 수 없는 경우"
    // neverNull = null

    var inferredNonNull = "컴파일러가 널이 불가능하다고 추정"
    // inferredNonNull = null

    var nullable: String? = "널이 될 수 있는 경우"
    nullable = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
    // println(strLength(nullable))

    var nullString: String? = null

    println(describeString(nullString))

    println(lengthString(nullString))

    println(nullString?.uppercase())

    println(nullString?.length ?: 0)
}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "문자열의 길이는 ${maybeString.length}"
    } else {
        return "공백이거나 Null 입니다"
    }
}

fun lengthString(maybeString: String?): Int? = maybeString?.length