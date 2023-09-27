package OOP

class Dog(
    val name: String,
    var weight: Int,
    val breed: String) {

    fun bark() {
        println(if (weight < 20) "Yip" else "Woof!")
    }

    fun showMe(){
        println(" Dog Name: $name")
        println("Dog Weight: $weight")
        println("Dog Breed: $breed")
        println("Dog bark: ${bark()}")
    }
}