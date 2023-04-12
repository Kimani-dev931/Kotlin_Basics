fun emobilis(){
    println("emobilis mobile technology")
    println("This is my user defined function")
}
fun students(firstname:String,age:Int){
    println(firstname + " is" +age + "years old")
}
fun course(coursename:String,period:Int){
    println("The  " + coursename + " course takes a period of  " + period + " months")
}

fun main(args: Array<String>) {
    emobilis()
    students(firstname = "Harrison",age =23)
    course(coursename = "Fullstack",period=4)
}