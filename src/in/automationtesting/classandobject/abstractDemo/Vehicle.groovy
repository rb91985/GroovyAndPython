package in.automationtesting.classandobject.abstractDemo

abstract class Vehicle {

    def wheel()
    {
        println("Four wheel vehicle")
    }
    def seats()
    {
        println("5 seats vehicle")
    }

    abstract def gears()
    abstract def acOption()

}
