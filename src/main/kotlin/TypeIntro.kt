const val MAX_EXPERIENCE: Int = 5000

fun main(args: Array<String>) {
    val playerName = "Estragon"
    var hasSteed = "non"
    val tractirTitle = "Рог единорога"
    val masterName = "Alfred"
    var coins = 50
    val list:MutableList<String> = mutableListOf("Вино", "Молоко", "Мясо")
    list.add("Сок")
    list.add(0, "Виски")
    list.add(0, "Вода")
    println(list)
    println(list.contains("Виски"))
    println(list.lastIndexOf("Молоко"))
    list.sortDescending()
    println(list)

    val name = playerName.reversed()
    println(name)



    list.forEach{ word ->
        println(word)
    }

    var experiencePoint = 5
    experiencePoint += 5
    println(experiencePoint)
    println(playerName)
}