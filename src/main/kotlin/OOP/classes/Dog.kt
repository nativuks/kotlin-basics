package OOP.classes

class Dog(
    val name: String,
    var weight: Int,
    val breed: String) {

    var activities = arrayOf("Walks")
    val weighInKg: Double
        get() = weight / 2.2

    init {
        println("Init Dog")
    }

     fun bark() {
        println(if (weight < 20) "Yip" else "Woof!")
    }

    fun showMe(){
        println(" Dog Name: $name")
        println("Dog Weight: $weight")
        println("Dog Breed: $breed")
        println("Dog Activities: ${activities[0]}")
        println("Dog bark: ${bark()}")
    }
}