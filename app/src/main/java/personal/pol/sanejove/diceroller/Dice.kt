package personal.pol.sanejove.diceroller

class Dice(val numSides : Int) {
    fun roll() : Int{
        val randomNumber = (1..this.numSides).random()
        return randomNumber
    }
}