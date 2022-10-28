package in.automationtesting.classandobject.stringdemo

class stringMethods {
    static main (args)
    {
        //String is Immutable
        def s = "Groovy"
        def s1 = s.concat(" Program")

        println(s1)
        //"Groovy program"

        def str1 = "Groovy"
        def str2 = "groovy"
        def str3 = ""
        def str4 = "Java program"
        def str5 ="          groovy                   program              "

        println("The length of the s1 is: "+s1.length())
        println("The character at positioin 5 is: "+s1.charAt(5))
        println("the contains value is: "+s1.contains("z"))
        println("the starts with demo: "+s1.startsWith("ro"))
        println("the ends with demo: "+s1.endsWith("gra"))
        println("the equals demo: "+str1.equalsIgnoreCase(str2))
        println("the index of y is: "+s1.indexOf('y'))
        println("the empty demo: "+s1.isEmpty())
        println("the empty demo: "+str3.isEmpty())
        println("The replace demo: "+str4.replace("Java","Grovy"))
        println("Substring demo: "+s1.substring(3,10))
        println("the lower case demo: "+s1.toLowerCase())
        println("the upper case demo: "+s1.toUpperCase())
        println("trim demo: "+str5.trim())
        println("split demo: "+str4.split("v")[1])


    }
}
