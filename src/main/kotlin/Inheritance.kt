open class parentclass{
    val dad="He likes playing soccer"
    val mum="she likes cooking"

}

class  Boyclass:parentclass(){
    fun myboy(){
        println(dad)
    }

}

class girlclass:parentclass(){
    fun mygirl(){
        println(mum)
    }


}

fun main(args: Array<String>) {
    val boy=Boyclass()
    boy.myboy()
    val girl=girlclass()
    girl.mygirl()
}