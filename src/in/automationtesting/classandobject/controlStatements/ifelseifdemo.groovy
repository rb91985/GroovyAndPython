package in.automationtesting.classandobject.controlStatements

class ifelseifdemo {
    static main (args)
    {
        def marks = 30
        if(marks >= 90)
            {
                println("A grade")
            }
        else if(marks>60 && marks <90)
        {
            println("B grade")

        }
        else if(marks>35 && marks <=60)
        {
            println("c grade")
        }
        else {
            println("fail")
        }

    }
}
