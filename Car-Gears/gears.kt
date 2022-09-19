internal open class Car(var gear: Int, var speed: Int) {
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    override fun toString(): String {
        return "No. of gears are : $gear\nSpeed of SuperCar is : $speed mph"
    }
}

internal class SuperCar(gear: Int, speed: Int, var setHeight: Int) : Car(gear, speed) {
    fun setHeight(newValue: Int) {
        setHeight = newValue
    }

    override fun toString(): String {
        return """${super.toString()}
Ride height is : $setHeight inch"""
    }
}

object gears {
    @JvmStatic
    fun main(args: Array<String>) {
        val mb = SuperCar(5, 180, 15)
        println(mb.toString())
    }
}