package in.automationtesting.classandobject

class MethodWithParameterDemo {
    static main(args)
    {
//        def a= 10
//        def b = 20
//        def c = 50
//
//        def d = a+ b+ c
//        println("the value of a b c is :" +d)
//
//        def(e,f,g)=[50,20, 100]
//        def h = a+f+g
//        println("value of e,f,g is: "+h)
        MethodWithParameterDemo mwpd = new MethodWithParameterDemo()
        mwpd.methodWithParameters(10,20,30)
        mwpd.methodWithParameters(30,20,50)
    }
    def methodWithParameters(def firstvalue, def secondvalue, def thirdvalue)
    {
        def total = firstvalue+secondvalue+thirdvalue
        println("total: " +total)
    }
}
