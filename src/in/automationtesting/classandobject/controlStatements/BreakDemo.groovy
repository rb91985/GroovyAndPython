package in.automationtesting.classandobject.controlStatements

class BreakDemo {
    static main (args)
    {
        for (def i in 1..10){
            if(i==5)
                break
            println(i)
        }
    }
}
