package in.automationtesting.classandobject

import javax.print.attribute.HashPrintJobAttributeSet

class Laptop {
    def price
    //def brand
    def screenWorkingCondition

    static main(args)
    {
       Laptop lenovo = new Laptop()
        lenovo.logIn()
        lenovo.logOut()

        //lenovo.brand = "HP"
        lenovo.price = 10000
        lenovo.screenWorkingCondition = true

        //println(lenovo.brand)
        println(lenovo.price)
        println(lenovo.screenWorkingCondition)

        Laptop apple = new Laptop()
        apple.logIn()
        apple.logOut()

        //apple.brand = "apple"
        apple.price = 50000
        apple.screenWorkingCondition = true

        //println(apple.brand)
        println(apple.price)
        println(apple.screenWorkingCondition)
    }

    def logIn()
    {
       println("System loggin in")
    }

    def logOut()
    {
        println("system logging out")
    }
}
