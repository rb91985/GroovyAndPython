package in.automationtesting.classandobject.controlStatements

class SwitchDemo {
    static main (args)
    {
        def marks = 50

        switch(marks)
        {
            case 0..34:
                println("Failed")
                break
            case 35..60:
                println("Third class")
                break
            case 60..75:
                println("Second class")
                break
            default:
            println("First Class")
            break
        }
    }
}
