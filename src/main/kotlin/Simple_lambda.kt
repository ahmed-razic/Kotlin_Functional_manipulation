fun main() {
    val waterFilter = {dirty: Int -> dirty / 2}
    println(waterFilter(30))

    val myFish = listOf(Fish("Flipper"), Fish("Moby Dick"), Fish("Dory"))

    println(myFish.filter {it.name.contains('i')}.joinToString(", ") {it.name} )
}

data class Fish(val name: String)

