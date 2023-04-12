class Hesabu{
    //data member
    private var number:Int=8
    //member function
    fun calculateSquare():Int{
        return number*number
    }
}
class Harrison(){
    var name="Emobilis"
    fun myname(){
        println(name)
    }
}
 class BMI(){
     var weight=120
     var height=7
     fun mybmi():Int{
         return weight/height
     }
 }

fun main(args: Array<String>) {
    //create an object
    val myobj=Hesabu()
    println(myobj.calculateSquare())
    val myobj2=Harrison()
    println(myobj2.myname())
    val myobj3=BMI()
    println(myobj3.mybmi())
}