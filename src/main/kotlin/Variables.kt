import java.time.LocalDate


fun main1() {
    //chapter01()
    //task011()
    //task02()
    //task03()
    //task04()
    //task05()
    task05(10)
    //task06()
}

fun task05(num: Int) {
    //TODO("Not yet implemented")

    val y = num.toLong()

    // var y1 = (Long) num
    println("values: $y")
}

private fun chapter01() {
    println("Pow!")
    //Do something (statements)
    var x = 3
    var y = 20
    val name = "Cormoran"
    x *= 10
    // This is comment

    // Do something again and again (loops)
    println("=======While Loop =====")
    while (x > 20) {
        x -= 1

        println("x is now $x.")
    }
    println("====== For in Loop ======")
    for (i in 1..10) {
        x += 1
        println("x is now $x.")
    }

    // Do something under a condition
    println("=====Conditionls===")
    if (x == 20) {
        println(" x must be 20.")
    } else {
        println(" x  isn't 20.")
    }

    if (name.equals("Cormoran")) {
        println("$name Strike")
    }

    //
    println("=====Without Interpolation====")
    println("The name is" + name)


    // When
    println("=======When==========")
    when (x) {
        20 -> print("x == 20")
        30 -> print("x == 30")
        else -> {
            print("x is neither 1 nor 2")
        }
    }

    println(if(x > y) "x is greater than y" else "x is not greater than y")
}
//“YabbaDabbaDo”

private fun task01() {
    var x = 1
    while ( x < 3) {
        print(if(x== 1) "Yab" else "Dab")
        print("ba")
        x = x + 1

    }
    if(x == 3) println("Do")
}

private fun task011() {

    for(i in 1..3) {
        when(i) {
            1-> {
                print("Yab")
            }
            2-> {
                print("Dab")
            }

            else -> {
                print("DO")
            }

        }

        print(if(i <= 2)"ba" else " ")

    }
}

private fun task02(){
    var x = 1
    while(x < 10) {
        if(x > 3){
            println("big x")
        }
        //increase x
        x ++
    }
}

private fun task03(){
    //val x = 10
    var x = 10
    while(x > 1) {
        x = x - 1
        if (x < 3) println("small x")
    }
}

private fun task04() {
    var x = 10
    while(x > 1){
        x = x-1
        //print(if(x < 3)"small x")
        print(if(x < 3)"small x" else "big x")
    }
}


private fun task05() {
    var x = 1
    while(x <= 6) {
        when(x) {
            1 -> {
                var x1 = 0
                var y = 0
                while (x1 < 5){
                    y = x1 -y
                    print("$x1$y ")
                    x1 ++

                }
                println(" ")
            }
            2 -> {
                var x1 = 0
                var y = 0
                while (x1 < 5){
                    y = y + x1
                    print("$x1$y ")
                    x1 ++

                }
                println(" ")

            }
            3 -> {
                var x1 = 0
                var y = 0
                while (x1 < 5){
                    y = y + 3
                    if (y > 4) y = y -1
                    print("$x1$y ")
                    x1 ++

                }
                println(" ")

            }

            4 -> {
                var x1 = 0
                var y = 0
                while (x1 < 5){
                    x1 = x1 + 2
                    y = y + x1
                    print("$x1$y ")
                    x1 ++

                }
                println(" ")

            }

            5 -> {
                var x1 = 0
                var y = 0
                while (x1 < 5){

                    if (y < 5) {
                        x1 = x1 + 1
                        if(y < 3)  x1 = x1 -1
                    }
                    y = y + 3
                    print("$x1$y ")
                    x1 ++

                }
                println(" ")

            }
            else ->{
                println("Default Value")
            }
        }


        x ++

    }
}

private fun aux(): String {

    return ""
}

