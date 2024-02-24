class Manager( name:String, experience:Int, private var performance:Int, private var levelSales:Int ):
            Employee(name,experience), LevelSales {
    override val _levelSales: Int
        get() = levelSales
            }