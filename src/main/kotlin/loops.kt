fun main(args: Array<String>) {
    //for loop //used in arrays and ranges
    for(i in 10 .. 20){
        println("Loop $i")
    }
    var myarray= arrayOf("Eric","Purity","Daniel")
    for(jina in myarray){
        println(jina)
    }
    //while loop
    var nambari=10
    while(nambari>=5){
        println("loop $nambari")
        nambari--
    }
    // while loop 2
    var num =20
    while(num >= 4){
        println(num)
        num--
    }
    //Do ..while loop
    var numloop=100
    do{
        println("loop $numloop")
        numloop++
    }while(numloop<=105)
    //write a kotlin program that uses a for-loop to printout even numbers between 1 and 10

    for(i in 1 .. 10){
        if(i % 2 == 0) {
            println(i)
        }
    }

}