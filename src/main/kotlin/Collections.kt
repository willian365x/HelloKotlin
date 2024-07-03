fun main() {

    //MAP
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)

    juiceMenu.put("coconut", 150)

    println(juiceMenu)

    println("The value of coconut juice is: ${juiceMenu["coconut"]}")
    println("The value of kiwi juice is: ${juiceMenu["kiwi"]}")

    juiceMenu.remove("coconut")

    println(juiceMenu)

    println(juiceMenu.keys)
    println(juiceMenu.values)


    //LIST
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    val shapesLocked: List<String> = shapes
    println("The first item in the list is: ${shapesLocked.first()}")

    println("This list has ${shapesLocked.count()} items")

    println("circle" in readOnlyShapes)

    shapes.add("pentagon")
    println(shapes)

    shapes.remove("pentagon")
    println(shapes)


    //SET
    val readOnlyFruit = setOf("maçã", "banana", "cereja", "cereja")
    println(readOnlyFruit)
    val fruit: MutableSet<String> = mutableSetOf("maçã", "banana", "cereja", "limão", "limão")
    println(fruit)

    println("Este conjunto tem ${fruit.count()} items")
}