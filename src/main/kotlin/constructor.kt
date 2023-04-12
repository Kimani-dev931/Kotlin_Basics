class students(val name:String,var age:Int,var gender:String,var course:String){


}

fun main(args: Array<String>) {
    val obj=students(name = "Harrison", age = 23, gender = "male", course = "Fullstack")
    println("My name is ${obj.name}")
    println("Im ${obj.age} years old")
    println("Im taking a ${obj.course} course")
    println("My name is ${obj.name},Im ${obj.age} years old,Im of the ${obj.gender}  gender and Im taking a ${obj.course} development course")

}