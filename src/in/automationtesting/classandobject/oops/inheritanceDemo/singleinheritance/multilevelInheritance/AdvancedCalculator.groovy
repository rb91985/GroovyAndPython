package in.automationtesting.classandobject.oops.inheritanceDemo.singleinheritance.multilevelInheritance

class  AdvancedCalculator extends calculator{
    static main (args)
    {
        AdvancedCalculator ac= new AdvancedCalculator()
        ac.add()
        ac.divide()
        ac.subtract()
        ac.multiply()

        println(ac.brand)
        println(ac.solarPowered)
    }

    def multiply()
    {
        println("Multiply the numbers")
    }
    def divide()
    {
        println("divide the numbers")
    }
}
