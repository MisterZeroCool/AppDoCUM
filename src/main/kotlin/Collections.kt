fun  main(args:Array<String>){
//    List
    val list = listOf<String>("word", "help", "world")
    val mutableList = mutableListOf<String>("Katy", "Jay", "Ralf")
    mutableList.add(2, "Tom")
    mutableList.forEach{word->
        println(word)
    }

    println()

    mutableList.sort()

    mutableList.forEach{word->
         println(word)
     }

    println()

    mutableList.sortDescending()

    mutableList.forEach{word->
        println(word)
    }
}