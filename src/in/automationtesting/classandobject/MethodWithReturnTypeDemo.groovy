package in.automationtesting.classandobject

class MethodWithReturnTypeDemo {
    static main(args){
        def m =10

        MethodWithReturnTypeDemo mwrtd = new MethodWithReturnTypeDemo()
        def total = mwrtd.sumofthreenumbers(30, 40,55)
        def finaltotal = total * 10
println(finaltotal)

    }

   def sumofthreenumbers(a,  b,  c) {
         a + b + c
    }
}