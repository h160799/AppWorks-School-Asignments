open class Human (val name: String) {
    open fun attack() {
        println("$name use Fist Attack")
    }
}

class Mage(name: String): Human(name) {
    override fun attack() {
        println("$name use Fireball! ")
    }
}

fun Human.mana(mana: Int) {
    if (mana > 0) {
        println("$name has mana $mana MP")
    } else {
        println("$name has no mana")
    }

}

fun main() {
    val human = Human("Johnny")
    println(human.attack())
    println(human.mana(500))
    val mage = Mage("Luis")
    println(mage.attack())
}




