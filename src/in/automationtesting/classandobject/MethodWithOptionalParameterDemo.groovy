package in.automationtesting.classandobject

class MethodWithOptionalParameterDemo {
    static main (args){
        MethodWithOptionalParameterDemo mwopd = new MethodWithOptionalParameterDemo()
        mwopd.methodWithParameters(10,20, 100)
    }
    def methodWithParameters(def firstvalue, def secondvalue, def thirdvalue=30)
    {
        def total = firstvalue+secondvalue+thirdvalue
        println("total: " +total)
    }
}

