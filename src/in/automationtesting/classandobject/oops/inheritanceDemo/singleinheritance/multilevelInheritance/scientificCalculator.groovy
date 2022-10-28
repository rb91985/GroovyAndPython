package in.automationtesting.classandobject.oops.inheritanceDemo.singleinheritance.multilevelInheritance

class scientificCalculator extends AdvancedCalculator{
    static main (args){
        scientificCalculator sc = new scientificCalculator()
        sc.add()
        sc.subtract()
        sc.divide()
        sc.multiply()
        sc.calculus()
        sc.statistics()
    }
    def calculus()
    {
        println("Calculus functions")
    }
    def statistics()
    {
        println("Statistics functions")
    }

}
