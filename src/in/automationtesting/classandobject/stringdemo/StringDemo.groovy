package in.automationtesting.classandobject.stringdemo

class StringDemo {
    static main(args)
    {
//        Java String
        String strLiteral = "this is String Literal"
        println(strLiteral)

        String strNew = new String("this is using new keyword")
        println(strNew)

        // Groovy strings

        // ********* single quoted string*****************

        def singleQuoteString = 'This is single quote string'
        println("single quoted string is: "+singleQuoteString)

        // ********* triple quoted string*****************

        def triplesingleQuoteString = '''\
This is triple single quote string
This is new line'''
        println("triple single quoted string is: "+triplesingleQuoteString)

        // ********* Double quoted string*****************
        def sampleData = " Groovy"
        def DoubleQuote = "This is double quote string ${sampleData}"
        println("Double quoted string is: "+DoubleQuote)

        // ********* Triple Double quoted string*****************

        def tripleDoubleQuote = """This is triple double quote string 
This is for new line triple double quotes
${sampleData}"""
        println("triple Double quoted string is: "+tripleDoubleQuote)

        // ********* slashy string*****************
        def slashyString = /This is slashy string
this is new line
${sampleData}/
        println(slashyString)

        // ********* dollar slashy string*****************
        def dollarslashyString = $/This is dollar slashy string/
this is new line
${sampleData}/$
        println(dollarslashyString)


    }
}
