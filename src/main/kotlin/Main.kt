fun main(args: Array<String>) {
    val manager = Manager("Egor",13,57,20)
    val director1 = Director("Misha",17,30)
    val director2 = Director("Nikolya",18,40)
    val manager1 = Manager("Alena",9,20,320)
    val manager2 = Manager("Elena",7,20,280)
    val manager3 = Manager("Andrey",9,16,120)
    val salesman = Salesman("Olga",5,200)
    val salesman1 = Salesman("Victor",5,160)
    val salesman2 = Salesman("Nikita",2,90)

    var employees = mutableListOf<Employee>(
        director1, director2, manager, manager1, manager2, manager3, salesman, salesman1, salesman2
    )

    var employeeLevelSales = mutableListOf<LevelSales>(
         manager, manager1, manager2, manager3, salesman, salesman1, salesman2

    )

    for (employee in employees ){
        employee.printInfoEmployee()
        if (employee is LevelSales){
            employee.printLevelSales()
        }
    }
    println( )

    val averageLevelSales = 200

    for (employee in employeeLevelSales)
    {
        employee.checkLevelSales(averageLevelSales)
    }
}