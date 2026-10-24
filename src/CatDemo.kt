
fun walkAndReport(cat: Cat, distance: Int) {
    if (cat.walk(distance)) {
        println("${cat.name} walked $distance. Weight is now ${cat.weight}.")
    } else {
        println("${cat.name} cannot walk $distance (weight must stay at ${Cat.MIN_WEIGHT} or more).")
    }
}

fun eatAndReport(cat: Cat, amount: Int) {
    if (cat.eat(amount)) {
        println("${cat.name} ate $amount. Weight is now ${cat.weight}.")
    } else {
        println("${cat.name} cannot eat $amount (weight must stay at ${Cat.MAX_WEIGHT} or less).")
    }
}

fun main() {

    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 6)

    walkAndReport(binnie, 3)
    eatAndReport(binnie, 1)
    walkAndReport(clyde, 3)
    eatAndReport(clyde, 20)

    println()
    println(binnie)
    println(clyde)
}
