package in.automationtesting.classandobject.controlStatements

class nestedIfDemo {
    static main(args)
    {
        if(1>0)
        {
            println("out of if block")
            if (1>2){
                println("1 is greater than 0 and 1 is less than 2")
            }

        }
        println("out of if")
    }
}
