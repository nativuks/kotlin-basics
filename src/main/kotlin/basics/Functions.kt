package basics

class Functions {

    fun mainFunction() {
        //override functions
        showNumber(5)
        showNumberDefaultValue()

        showNumber(3,2)

        val message = myMessage("Hello world")
        println(message)

        showNullValue()


        gameRockScissorsPaper()
    }
    //Unit is like void in Java is optional
    fun showNumber(num: Int): Unit {
        //TODO("Not yet implemented")

        val y = num.toInt()


        // var y1 = (Long) num
        println("values: $y")
    }

    fun showNullValue() {
        var number : Int?
        number = null

        if(number == null) {
            println("Is null")
        }

        //number = 10

        number.let {
            println("NOt NUll $number")
        }

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


    fun gameRockScissorsPaper() {
        val options = arrayOf("Rock", "Paper", "Scissors")
        val gameChoice = getGameChoice(options)
        val userChoice = getUserChoice(options)
        printResult(userChoice, gameChoice)
    }
    // if the function has a single line, we van use = operator instead of {}
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