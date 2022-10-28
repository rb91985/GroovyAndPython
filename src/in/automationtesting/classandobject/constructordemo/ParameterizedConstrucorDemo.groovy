package in.automationtesting.classandobject.constructordemo

class ParameterizedConstrucorDemo {

    def employeeName
    def empID

    ParameterizedConstrucorDemo(employeeName, empID)
    {
        this.employeeName = employeeName
        this.empID = empID
        println("the employee name is: "+employeeName)
        println("the emplyee id is: "+empID)

    }
    static main(args)
    {
        ParameterizedConstrucorDemo emp1=new ParameterizedConstrucorDemo("tom", "101")
        ParameterizedConstrucorDemo emp2=new ParameterizedConstrucorDemo("Jerry", "102")

    }
}
