package in.automationtesting.classandobject.datatypes

class DataTypeConversionDemo {
    static main(args) {
        def varChar = 65 as char
        println(varChar)

        def strNumber = "100" as int
        int a=strNumber+10
        println(strNumber)
        println(a)

        def doubleValue = 10.3422242341234
        println(doubleValue)
    }
}
