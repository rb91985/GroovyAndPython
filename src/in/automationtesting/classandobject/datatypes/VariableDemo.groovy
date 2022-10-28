package in.automationtesting.classandobject.datatypes

class VariableDemo {
    def instanceint = 15
    def staticInt = 30

    static main(args)
    {
        //println("local variable is: " +localint)
        VariableDemo vd= new VariableDemo()
        vd.method()

        //def a= 10
        //multiple assignment
        def (a,b,c) = ["groovy","20", 10]
        println("a value is: "+a)
        println("b value is: "+b)
        println("c value is: "+c)
    }
    def method()
    {
        def localint = 10
        println("local variable is: " +localint)
        println("instance variable is: " +instanceint)
    }
}