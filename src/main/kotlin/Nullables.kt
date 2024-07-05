import java.util.Calendar

fun strLength(notNull: String): Int = notNull.length

fun getAgeBorn(age: String): Int = when (age) {
    "40" -> age.toInt()
    "50" -> age.toInt()
    else -> age.toInt()
}

fun describeString(maybe:String?): String{
    if(maybe != null && maybe.length > 0){
        return "Tamanho da String = ${maybe.length}"
    }else{
        return "vazio ou nullo"
    }
}

fun main() {
    var neverNull: String = "Isso pode ser nulo"
    //neverNull = null // o compilador acusa erro nessa linha

    var nullable: String? = "Isso pode ser nulo aqui"
    nullable = null

    var inferredNotNull = "O compilador assume aqui como not-null como padrão"
    //inferredNotNull = null // o compilador acusa erro nessa linha

    println(strLength(neverNull))
    //println(strLength(nullable)) //Aciona uma exception do compilador

    val idade = getAgeBorn("5")
    val yearToday = Calendar.getInstance().get(Calendar.YEAR)
    println("Você nasceu no ano de ${yearToday - idade}")

    val nullString = null
    println(describeString(nullString))
}