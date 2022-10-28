package in.automationtesting.classandobject.controlStatements

class ForDemo {
    static main(args) {
        for (int i = 1; i <= 10; i++) {
            println('the value of i is :' + String.valueOf(i))
        }
        println("------------------------------------")
        def languages = ["Groovy", "Java", "Python"]
//        for (def i=0; i<languages.size(); i++){
        //           println languages[i]}

        for (def language : languages) {
            println(language)
        }
        println("------------------------------------")
        0.upto(10)
                {
                    println(it)
                }
        println("------------------------------------")
        50.times
                {
                    println(it)
                }
        println("------------------------------------")
        for(i in 0..10)
                {
                    println(i)
                }
        println("------------------------------------")
        languages = ["Groovy","Java","Python"]
        languages.each {
            println(it)
        }
        println("------------------------------------")
        (0..10).each {println(it)}
        println("------------------------------------")
        for (int i = 1; i <= 10; i+=2) {
            println('the value of i is :' + String.valueOf(i))
        }
        println("------------------------------------")
        5 .step(10,2)
        {println(it)
        }


    }
}
