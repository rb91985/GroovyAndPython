package in.automationtesting.classandobject.abstractDemo

class Car extends Vehicle{
    static main(args)
    {
        Car c= new Car()
        c.acOption()
        c.gears()
        c.powerWindows()
        c.seats()
        c.wheel()

    }

    @Override
    def gears() {
       println("This is manual gear vehicle")
    }

    @Override
    def acOption() {
       println("This doesn't have ac option")
    }
    def powerWindows()
    {
        println("No power windows")
    }
}
