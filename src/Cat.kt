class Cat(val name: String, var age: Int, weight: Int) {

    var weight: Int = weight
        private set

    companion object {
        const val MIN_WEIGHT = 5
        const val MAX_WEIGHT = 20
    }

    fun walk(distance: Int): Boolean {
        if (distance <= 0 || weight - distance < MIN_WEIGHT) return false
        weight -= distance
        return true
    }

    fun eat(amount: Int): Boolean {
        if (amount <= 0 || weight + amount > MAX_WEIGHT) return false
        weight += amount
        return true
    }

    override fun toString(): String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
