package OOP.classes


class Clases {


    fun mainClases() {
        val dog = Dog("Firulais", 70, "Mixed")
        dog.showMe()

        dog.weight = 15
        dog.showMe()
        println("========")
        val songOne = Song("The mesopotamians", "The Might Be Giants")
        val songTwo = Song("Going Underground", "The Jam")
        val songThree = Song("Make Me Smile", "Steve Harley")

        songTwo.play()
        songTwo.stop()
        songThree.play()

        val drumKit = DrumKit(true,true)
        drumKit.playSnare()
        drumKit.playTopHat()
        drumKit.hasSnare = false
        drumKit.playTopHat()
        drumKit.playSnare()
    }
}