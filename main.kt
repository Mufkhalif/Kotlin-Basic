fun main() {
	
    val button = Button()
    button.onTouch()
    
}

class Button: ButtonInterface {
    override var buttonName: String = "Laptop"

    override fun onClick() {
        println("$buttonName clicked")
    }

    override fun onTouch() {
        println("$buttonName touched")
    }
}

interface ButtonInterface {
    var buttonName: String
    fun onClick()
    fun onTouch()
    
}

class Cart(var inputProduct: String) {
    val product = "Laptop"
    
    fun addCart() {
        println("$inputProduct add to cart!")
    }
    
    // initialRunMethod
    // init {
    //    addToCart()
    // }
}



data class Person(var name: String, var age: Int)


fun printPersonList() {
    var people = ArrayList<Person>()
    
    for(x in 0 until nameList().size) {
		val person = Person(nameList()[x], 20 + x)
        people.add(person)
    }
    
    print(people.toString())
}


fun nameList(): ArrayList<String> {
    val names = ArrayList<String>()
    names.add("Joe")
    names.add("Anna")
    names.add("Mark")
    names.add("Lisa")
    return names
}

fun whenAndLooping() {
   val jobLevel: String = "hard"
    
   when(jobLevel) {
        "beginner" -> println("joe is beginner")
        "medium" -> println("joe is medium")
        "hard" -> println("joe is hard")
    }
    
	for (x in 1..11) println(x)
    
    val names = arrayOf("ana","lisa","ahmad")
    for (name in names) println("Hello $name")
}
