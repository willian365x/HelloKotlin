import kotlin.math.*

fun hello() {
    return println("Hello, world!")
}

fun Sum(a: Int, b: Int) = sqrt((a + b).toDouble())

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

//function without return
fun printMessage(message: String) = println(message)

//lambdas function
fun toSeconds(time: String): (Int) -> Int = when (time) {
    "Hour" -> { x -> x * 60 * 60 }
    "Minutes" -> { x -> x * 60 }
    "Seconds" -> { x -> x }
    else -> { x -> x }
}

fun main() {
    hello()
    println(Sum(88, 2))
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    printMessageWithPrefix("Hello", "Logger")
    printMessageWithPrefix("Log", "Hello")

    //implements function without return
    printMessage("Hello World Kotlin with functions")

    //lambda expression
    println("Carla Jonathan".uppercase())

    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString("Carla Jonathan"))

    val numbers = listOf(1, 3, -2, 6, -5, -6, 0)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }

    println("Matriz de $numbers\n")
    println("Positives $positives")
    println("Negatives $negatives")

    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { x -> x * 3 }

    println("Doubled = $doubled")
    println("Tripled = $tripled")

    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2Sec = toSeconds("Hour")
    val totalTimeInSeconds = timesInMinutes.map(min2Sec).sum()
    println("Total time is $totalTimeInSeconds secs")

}