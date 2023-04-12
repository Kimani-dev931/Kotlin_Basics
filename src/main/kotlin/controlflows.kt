fun main(args: Array<String>) {
    var num =6
    var num1=34678
    //if statement
    if (num<12){
        print("its true")
        var r=14
        var q=13
        println(r+q)


    } //if ..else statement
    else{
        println{"its false"}
    }
    if(num1<0){
        println("The number is negative")
    }
    else if(num1>0 && num1<10){
        println("This is a single digit no")
    }
    else if(num1>=10 && num1<100){
        println("This is a double digit number")
    }
    else
        println("it has three or more digit")


}