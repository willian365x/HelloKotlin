import java.util.StringTokenizer

class Customer(id: Int, email: String) : Contact(id, email)
open class Contact(val id:Int, var email:String){
    var category: String = ""
}

fun main(){
    val customer = Customer(1, "nonon@nono.net")

    println(customer.id)
    println(customer.email)
    println(customer.category)
}