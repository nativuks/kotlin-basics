import OOP.Clases
import basics.Basic
import basics.Functions
import basics.Loops

fun main(args: Array<String>) {
    println("==========Welcome to Kotlin =========")
    callExamples()
}

fun callExamples() {
    val basic = Basic()
    //basic.mainBasic()

    val functions = Functions()
    //functions.mainFunction()

    val loops = Loops()
    //loops.mainLoops()
    val clases = Clases()
    clases.mainClases()

}