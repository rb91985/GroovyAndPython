package in.automationtesting.classandobject.staticDemo

class staticMethodDemo {
    def num =100
    static staticnum = 20

    static main(arg){
//        println(staticnum)
        staticMethodDemo smd = new staticMethodDemo()
        smd.sum()
        staticsum()
    }
    def sum()
    {
        println(num * num)
    }
    def static staticsum()
    {
        println(staticnum * staticnum)
    }
}
