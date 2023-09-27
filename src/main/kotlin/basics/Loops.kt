package basics

class Loops {

    fun mainLoops() {
        showForInData()
        showForUntilData()
        showForDownTo()
        showForSkypeInRange()
        showForArrays()
        showForArraysIndex()
    }

    //show all Range
    fun showForInData() {
        for (x in 1..3) println("showForInData$x")

    }
    //show all Range except the last
    fun showForUntilData() {
        for (x in 1 until 10) println("showForUntilData$x")
    }

    fun showForDownTo() {
        for (x in 3 downTo  1) println("showForDownTo$x")
    }

    fun showForSkypeInRange() {
        for (x in 1..10 step 2) println("showForSkypeInRange$x")
    }

    fun showForArrays() {
        val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
        var x = 0
        for (hobbit in hobbits) println("${hobbit} is a good Hobbit name")
    }

    fun showForArraysIndex(): Unit {
        val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")

        var x = 0
        for ((index, hobbit) in hobbits.withIndex()) {
            println("${hobbit} is a good Hobbit name. His index is $index")
        }
    }

}