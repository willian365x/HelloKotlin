fun main() {

    //IF
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    val a = 1
    val b = 2

    println(if(a > b) a else b)

    //WHEN

    val obj = listOf("Carla", "Jonathan", "Emilly", "Rute")
    obj.forEach { c ->
        when (c) {
            "Carla" -> println("Contadora chefe")
            "Jonathan" -> println("Engenheiro")
            else -> "Desconhecido"
        }
    }

    val saud = "Hello"
    val result: Any = when (saud) {
        "Hello" -> println("Ola")
        "Ola" -> println("Hello")
        else -> "Desconhecido"
    }

    println(result)

    val temp = 26
    val descritption = when {
        temp < 0 -> "very cold"
        temp < 10 -> "bit cold"
        temp < 20 -> "warm"
        else -> "hot"
    }
    println(descritption)


    //RANGES
    val num = 1..20 step 2
    num.forEach { println(it) }

    println("====================================")

    val inverseNumber = 4 downTo 1
    inverseNumber.forEach { println(it) }

    val letters = 'a'..'z'
    letters.forEach { println(it) }

    //FOR
    for (number in 1..10) {
        print("$number ")
    }

    println()

    val cakes = listOf("carrot", "cheese", "chocolate")
    cakes.forEach { println("Yummy, it is a $it!") }

    //WHILE
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 3) {
        println("Eat cake")
        cakesEaten++
    }

    do {
        println("Bake cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}