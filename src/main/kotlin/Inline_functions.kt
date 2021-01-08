

fun fishExamples() {
    val fish = Fish("splashy")  // all lowercase
    myWith (fish.name) {
        println(capitalize())
    }
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

fun main () {
    fishExamples()

}