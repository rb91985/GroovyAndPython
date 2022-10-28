package in.automationtesting.classandobject.staticDemo

class staticDemoEmp {
    static main(args)
    {
        EmployeeData empdata = new EmployeeData()
        empdata.empid = '100'
        empdata.empname =  'tom'


        println("Employee ID is: "+empdata.empid)
        println("Employee Name is: "+empdata.empname)
        println("Company Name is: "+empdata.companyname)

        EmployeeData empdata1 = new EmployeeData()
        empdata1.empid = '101'
        empdata1.empname =  'jerry'


        println("Employee ID is: "+empdata1.empid)
        println("Employee Name is: "+empdata1.empname)
        print("Company Name is: "+empdata.companyname)
    }
}
