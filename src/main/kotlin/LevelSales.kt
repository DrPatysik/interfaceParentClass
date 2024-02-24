interface LevelSales  {
    val name:String
    val _levelSales:Int

    fun printLevelSales(){
        println("$name have sales level: $_levelSales !!")
    }
    fun checkLevelSales(n:Int){
        if (n > _levelSales)
        { println("$name has lower sales level") }
        else if (n == _levelSales)
        { println("$name has permissible sales level") }
        else { println("$name has high sales level!!") }
    }
}