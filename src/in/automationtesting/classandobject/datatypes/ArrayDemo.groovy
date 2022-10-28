package in.automationtesting.classandobject.datatypes

class ArrayDemo {
    static main(args)
    {
        def languages = new String[3]
        //add the values to this array
        languages[0] = "Groovy"
        languages[1] = "Java"

        languages.putAt(2,"Python")

        //languages[3]="c#"

        //print the array
        println(languages)

        //Size of an array
        println("the size of an array using size methodd :"+languages.size())
        println("the size of an array using length methodd :"+languages.length)

        //remove value from an arrya
        def arrayAfterRemovePython = languages - "Python"
        println(arrayAfterRemovePython)
    }
}
