fun main(args: Array<String>) {
    // mutable variables
    var myname="Harrison"
    // reassigning myname variable
    myname="Emobilis mobile technology"
    println(myname)

    // immutable variable
    val jinayangu="Pauline"
    // reassigning jinayangu variable,this will result to an error as this is an immutable variable.
   // jinayangu="michael"  ,I had to comment jinayangu variable because it will result to an error
    println("My name is:$jinayangu")
    println("My name is: "+jinayangu)
    // simple calculator using immutable values
     val num1=70
     val num2=35
      println("num1 + num2 = "+ (num1+num2))
      println("num1 - num2 = "+ (num1-num2))
      println("num1 * num2 = "+ (num1*num2))
      println("num1 / num2 = "+ (num1/num2))




}