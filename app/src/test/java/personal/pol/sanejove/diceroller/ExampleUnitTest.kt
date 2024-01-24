package personal.pol.sanejove.diceroller

import org.junit.Assert.*
import org.junit.Test

import org.junit.Assert.assertTrue

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_number_between_1_and_6() {
        var dice = Dice(6)

        assertTrue("The value of dice.roll() was not between 1 and 6", dice.roll() in 1..6)
    }
}