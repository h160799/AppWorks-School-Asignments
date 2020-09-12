class Human (val name: String ){
    fun attack(){
        println("$name use Fist Attack")
    }
}

fun main(){
    val human = Human("Johnny")
    println(human.attack())
}


