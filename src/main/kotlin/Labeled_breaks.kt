fun labels() {
    outerLoop@ for (i in 1..100) {
        print("i: $i ")
        for(j in 1..100) {
            //println("j: $j")
            if(i > 10) break@outerLoop
        }
    }
}

fun main() {
    labels()
}