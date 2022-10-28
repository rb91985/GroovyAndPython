package in.automationtesting.classandobject.controlStatements

class ContinueDemo {
    static main(args){

    for (def i in 1..10) {
        if(i==5)
            continue
        println(i)
    }
    }
}
