package basics

class Functions {

    fun mainFunction() {
        //override functions
        showNumber(5)
        showNumberDefaultValue()

        showNumber(3,2)

        val message = myMessage("Hello world")
        println(message)

        showForInData()
        showForUntilData()
        showForDownTo()
        showForSkypeInRange()
        showForArrays()
        showForArraysIndex()
        gameRockScissorsPaper()
    }
    //Unit is like void in Java is optional
    fun showNumber(num: Int): Unit {
        //TODO("Not yet implemented")

        val y = num.toLong()

        // var y1 = (Long) num
        println("values: $y")
    }

    fun showNumber(numA: Int, numB: Int) {
        //TODO("Not yet implemented")

        val y = numA.toLong()

        // var y1 = (Long) num
        println("values: $y $numB")
    }

    fun showNumberDefaultValue(num: Int = 10) {
        //TODO("Not yet implemented")

        val y = num.toLong()

        // var y1 = (Long) num
        println("values: $y")
    }

    fun myMessage(message: String): String {
        return message
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

    fun showForArraysIndex() {
        val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
        var x = 0
        for ((index, hobbit) in hobbits.withIndex()) {
            println("${hobbit} is a good Hobbit name. His index is $index")
        }
    }

    fun gameRockScissorsPaper() {
        val options = arrayOf("Rock", "Paper", "Scissors")
        val gameChoice = getGameChoice(options)
        val userChoice = getUserChoice(options)
        printResult(userChoice, gameChoice)
    }

    fun getGameChoice(optionsParams: Array<String>) = optionsParams[(Math.random() * optionsParams.size).toInt()]

    fun getUserChoice(optionsParams: Array<String>) : String {

        var isValidChoice = true
        var userChoice = ""

        while(isValidChoice) {
            print("Please enter one of the following")
            for(item in optionsParams) print(" $item")
            println(".")
            val userInput = readLine()
            if(userInput != null && userInput in optionsParams) {
                isValidChoice = false
                userChoice = userInput
            }
            if(!isValidChoice) println("You must enter a valid choice!!")
        }
        return userChoice
    }

    fun printResult(userChoice: String, gameChoice: String) {
        val result: String
        if(userChoice == gameChoice) result = "Tie!"
         else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
            (userChoice == "Paper" && gameChoice == "Rock") ||
            (userChoice == "Scissors" && gameChoice == "Paper")
        ) result = "You Win!"
        else result = "You  lose!"

        println("You chose $userChoice. I chose $gameChoice. $result")
    }

}