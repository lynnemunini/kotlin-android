import java.io.IOException
import java.lang.Exception
import java.lang.NullPointerException

/* Problem
* Each day a family consumes 15 litres of water
* Given the number of years as input, you need to calculate and output the amount of water
* consumed in that period*/
/*fun main() {
    /* val name = readln()
    //println("Hello, $name!")
    val age = readLine()!!.toInt()
    println("My name is $name and I'm $age years old.") */

    val years = readLine()!!.toInt()
    val water = 15 * 365 * years
    println("The water consumption is $water litres.")
    if (water >= 2000) {
        println("You are a very efficient person!")
    } else {
        println("You are not an efficient person!")
    }
}*/

/*Problem
* You are making a program for a security system that opens/closes the door based on the time
* of the day. Your program needs to take the hour as input
* (from 0 to 24) and output "Open", if it's less than or equal to 18, and "Closed" in other cases.*/

/*fun main(){
    val hour = readLine()!!.toInt()
    if (hour <=18) {
        println("Open")
    }
    else {
        println("Closed")
    }
}*/

/*Problem
* Given an age as input, you need to output the age group according to the following categories:
* 0-2: "Still in Mama's arms"
* 3-4: "Preschool Maniac"
* 5-11: "Elementary school"
* 12-14: "Middle school"
* 15-18: "High school"
* 19-22: "College"
*
* In case the age is negative, output "This is not possible".*/

/*fun main() {
    val age = readLine()!!.toInt()
    if (age in 0..2){
        println("Still in Mama's arms")
    }
    else if (age in 3..4){
        println("Preschool Maniac")
    }
    else if (age in 5..11){
        println("Elementary school")
    }
    else if (age in 12..14){
        println("Middle school")
    }
    else if (age in 15..18){
        println("High school")
    }
    else if (age in 19..22){
        println("College")
    }
    else {
        println("This is not possible")
    }
}*/

/*Problem
* Given a number as input, calculate and output its digit sum
 */
/*fun main () {
    var number = readLine()!!.toInt()
    var sum = 0
    while (number > 0){
        sum += number % 10
        number /= 10
    }
    println(sum)
}*/

/*Problem
* The given code uses an infinite while loop. to take continouous input,
* You need to fix the program to stop the loop when the user enters 0 and output the number of inputs taken.*/

/*fun main() {
    var number = readLine()!!.toInt()
    var count = 0
    while (number != 0) {
        number = readLine()!!.toInt()
        count++
    }
    println(count)
}*/

/*fun main() {
    var r = 2..6
    for (x in r) {
        if (10 % x in r) {
            println(x)
        }
    }
}*/

/*Problem
8 You are making a car parking software that needs to calculate and output the amount due based on the number
* of hours parked. The following are the rules:
* The first 5 hours are billed at $1 per hour
* after that, each hour is billed at $0.5 per hour
* for each 24 hours, there is a flat fee of $15
 */

/*fun main() {
    val hours = readLine()!!.toInt()
    var sum = 0.0
    if (hours >= 24) {
        sum+=15
        var rem = hours - 24
        while(rem >= 24){
            sum += 15
            rem -= 24
        }
        sum+= rem * 0.5
    }
    else if (hours <= 5) {
        sum+=hours*1
    }
    else if(hours>5 && hours<24){
        sum+=5
        val rem = hours - 5
        sum+= rem * 0.5
    }
    println(sum)
}*/

/*Problem
* Function that takes a letter and a text as arguments and returns the number of times the letter appears in the text*/
/*fun letter_count(letter: Char, text: String): Int {
    var count = 0
    for (x in text) {
        if (x == letter) {
            count++
        }
    }
    return count
}
fun main() {
    val letter: Char = readLine()!![0]
    val text: String = readLine()!!
    val result = letter_count(letter, text)
    println(result)
}*/

/*Problem
* Shipping Calculator
* You are making a program for a ecommerce website. The company needs to calculate the shipping cost based on the
* order amount
* The following are the rules:
* $75+ orders have free shipping
* Orders less than $75 are shipped for 10% of the order amount
* For international orders there is a 15% shipping fee with a maximum of $50
 */

/*fun shippingCost(amount:Double, international:Boolean):Double{
    if (! international){
        if (amount < 75){
            return 0.0
        }
        else{
            return 0.1*amount
        }
    }
    else{
        val ship = 0.15 * amount
        return if (ship > 50){
            50.0
        } else{
            ship
        }
    }
}
fun main() {
    val amount = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()
    val result = shippingCost(amount, international)
    println(result)
}*/

/**
 *
 */
/* fun main(){
    val age = (readLine() ?: return).toInt()
    val border = "`-._,-'"
    val times = 4
    printBorder(border, times)
    println("Happy Birthday Lynne!")
    printBorder(border, times)
    println()

    printCakeCandles(age)
    printCakeBottom(age, 7)
    println()
    println("You are already $age years old!")
    println("$age is the very best age to celebrate!")
}*/

/**
 *
 */
/*fun printBorder() {
    println("=======================")
}*/

/*fun printBorder(border: String = "====", times: Int = 1) {
    repeat(times) {
        print(border)
    }
    println()
}

/**
 *Print cake
 */
fun printCakeCandles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }
    println() // Print an empty line

    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }
    println()
}

/**
 *Print CakeBottom
 */
fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}*/

/*
    * Dice Game
*/
/* fun main(){
/* Create an instance of Dice class */
    val myFirstDice = Dice(20)
    println("Rolling the dice...")
    println("The result is ${myFirstDice.rollDice()}")
}

/**
 *
 */
class Dice(
    /**
     * Class properties
     */
    private val numOfSides: Int = 6) {
    /**
     * number of Sides
     */
    fun rollDice(): Int {
        return (1..numOfSides).random()
    }
} */


/**
* Abstract Class Dwelling
*/

/**
 * Program that implements classes for different kinds of dwellings.
 * Shows how to:
 * Create class hierarchy, variables and functions with inheritance,
 * abstract class, overriding, and private vs. public variables.
 */

/* import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val squareCabin = SquareCabin(6, 50.0)
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Floor area: %.2f" .format(floorArea()))
    }

    val roundHut = RoundHut(3, 20.0)
    with (roundHut) {
        println("\nRound Hut\n=========")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Floor area: %.2f" .format(floorArea()))
        println("Carpet Length: ${calculateMaxCarpetLength()}")
    }

    val roundTower = RoundTower(8, 5, 20.0)
    with (roundTower) {
        println("\nRound Tower\n===========")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        println("Floor area: %.2f" .format(floorArea()))
        println("Carpet Length: ${calculateMaxCarpetLength()}")
    }

}

/**
 * Abstract Class Dwelling
 */
abstract class Dwelling(private var residents: Int) {
    /**
     *
     */
    abstract val buildingMaterial: String
    /**
     *
     */
    abstract val capacity: Int

    /**
     * Checks if the dwelling has a room or not
     */
    fun hasRoom(): Boolean {
        return residents < capacity
    }

    /**
     * Checks if a new person can be added to the dwelling
     */
    fun getRoom() {
        if (hasRoom()) {
            residents++
            println("You got a room!!")
        } else {
            println("Sorry, at capacity and no rooms available")
        }
    }

    /**
     * Abstract function to be implemented in the subclasses
     */
    abstract fun floorArea(): Double // Abstract method
}

/**
 * Class SquareCabin
 */
class SquareCabin(residents: Int, val length: Double) : Dwelling(residents) {
    override val buildingMaterial: String = "Wood"
    override val capacity: Int = 6

    /**
     * Calculates the floor area of the square cabin
     */

    // Override the abstract method
    override fun floorArea(): Double {
        return length * length
    }
}

/**
 * Class RoundHut
 */
open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents) {
    override val buildingMaterial: String = "Straw"
    override val capacity: Int = 4

    // Override the abstract method
    override fun floorArea(): Double {
        return Math.PI * radius * radius
    }

    /**
     * Calculates the maximum carpet length
     */
    fun calculateMaxCarpetLength(): Double {
        return sqrt(2.0) * radius
    }
}

/**
 * Class RoundTower that inherits from RoundHut
 */
class RoundTower(residents: Int, val floors: Int = 2, radius: Double) : RoundHut (residents, radius) {
    override val buildingMaterial: String = "Brick"
    override val capacity: Int = 8 * floors

    // Override the abstract method
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
} */

/*
    * Use Lists in Kotlin
 */

/* fun main() {
    // val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println("List of numbers: $numbers")
    println("First number: ${numbers[0]}")

    // Kotlin also supports first() and last() functions
    println("First number: ${numbers.first()}")
    println("Last number: ${numbers.last()}")
    // Contains function to check if a number is in the list
    println("Contains 3: ${numbers.contains(3)}")
    println("Contains 7: ${numbers.contains(7)}")
    println("Size: ${numbers.size}")
} */

/* fun main() {
    // Lists are read-only
    val colors = listOf("green", "orange", "blue")
    println("List: $colors")
    println("Reversed list: ${colors.reversed()}")
    println("Sorted list: ${colors.sorted()}")
} */

/* fun main() {
    // Mutable Lists
    val entrees: MutableList<String> = mutableListOf("Beef", "Chicken", "Pork")
    println("List: $entrees")
    println("Add noodles: ${entrees.add("Noodles")}")
    println("List: $entrees")

    val moreItems = listOf("ravioli", "salad", "soup")
    println("Add list: ${entrees.addAll(moreItems)}")
    println("List: $entrees")

    // Remove elements from a list
    println("Remove Beef: ${entrees.remove("Beef")}")
    println("List: $entrees")

    // Remove at a specific index
    println("Remove at index 1: ${entrees.removeAt(2)}")
    println("Entrees: $entrees")

    // If you want to remove all elements from a list, use clear()
    entrees.clear()
    println("Entrees: $entrees")
    println("Empty? ${entrees.isEmpty()}")

} */

/*
    * Loops through a list
 */

/* fun main() {
    val guestsPerFamily = listOf(2, 4, 1, 3)
    var totalGuests = 0
    var index = 0

    while(index < guestsPerFamily.size) {
        totalGuests += guestsPerFamily[index]
        index++
    }

    println("Total Guest Count: $totalGuests")

    // For Loop
    val names = listOf("John", "Lynne", "Maria", "Bob")
    for (name in names) {
        println(name)
        println("Number of characters in $name: ${name.length}")
    }
} */

/* open class Item(val name: String, val price: Int)

/**
 * Class Noodles that inherits from Item
 */
class Noodles : Item("Noodles", 3) {
    override fun toString() :String {
        return name
    }
}

/**
 * Class Vegetables that inherits from Item
 */
class Vegetables (vararg val toppings: String) : Item("Vegetables", 5) {
    override fun toString() :String {
        if (toppings.isEmpty()) {
            return "$name Chef's Special"
        } else {
            return name + " " + toppings.joinToString()
        }
    }
}

class Order(val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item) : Order {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>) : Order{
        itemList.addAll(newItems)
        return this
    }

    fun print(){
        // Print out the order number
        println("Order #$orderNumber")
        var total = 0
        for (item in itemList) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }
}

fun main() {
    val ordersList = mutableListOf<Order>()

    val order1 = Order(1)
    order1.addItem(Noodles())
    ordersList.add(order1)

    val order2 = Order(2)
    order2.addItem(Vegetables("tomato", "onion"))
    ordersList.add(order2)

    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("tomato", "onion"))
    order3.addAll(items)
    ordersList.add(order3)

    val order4 = Order(4).addItem(Noodles()).addItem(Vegetables("Cabbage", "Onion"))
    ordersList.add(order4)

    ordersList.add(
        Order(5).addItem(Noodles()).addItem(Noodles())
            .addItem(Vegetables("Spinach"))
    )


    // Print the orders
    for (order in ordersList) {
        order.print()
        println()
    }
} */

/*
    * Make word lists
 */
/* fun main() {
    val wordListOne = listOf(
        "24/7",
        "multi-Tier",
        "30,000 foot",
        "B-to-B",
        "win-win",
        "front-end",
        "web-based",
        "pervasive",
        "smart",
        "six-sigma",
        "critical-path",
        "dynamic"
    )
    val wordListTwo = listOf(
        "empowered",
        "sticky",
        "value-added",
        "oriented",
        "centric",
        "distributed",
        "clustered",
        "branded",
        "outside-the-box",
        "positioned",
        "networked",
        "focused",
        "leveraged",
        "aligned",
        "targeted",
        "shared",
        "cooperative",
        "accelerated"
    )
    val wordListThree = listOf(
        "process",
        "tipping-point",
        "solution",
        "architecture",
        "core competency",
        "strategy",
        "mindshare",
        "portal",
        "space",
        "vision",
        "paradigm",
        "mission"
    )
    val filteredWords = wordListOne.filter { word -> word.length > 6 }
    val wordsStartWith =  wordListTwo.filter { it.startsWith("s", ignoreCase = true)}.shuffled().take(1).sorted()
    println(filteredWords)
    println(wordsStartWith)
} */

/* fun main() {
    val myListOfNames = listOf("John", "Lynne", "Maria", "Bob")
    for (i in myListOfNames.indices) {
        println("Index: $i, Name: ${myListOfNames[i]}")
    }
    myListOfNames.forEach() {
        println(it)
    }

    val myMutableList = mutableListOf(12, 34, 45, 76, 89)
    myMutableList.add(1, 100)
    myMutableList.removeAt(2)
    for (i in myMutableList.indices) {
        println("Index: $i, Value: ${myMutableList[i]}")
    }
    println("Number of elements: ${myMutableList.size}")
    println("Second element: ${myMutableList[1]}")
    println("Index of element \"45\": ${myMutableList.indexOf(45)}")

    // Set
    val mySet = setOf("US", "KE", "UG", "TZ", "KE")
    val myMutableSet = mutableSetOf(1, 3, 5, 7, 8)
    myMutableSet.add(9)
    myMutableSet.add(3)
    println(mySet)
    println(myMutableSet)

    // Map
    val secretMap = mapOf("Up" to 1, "Down" to 2, "Left" to 3, "Right" to 4)
    println(secretMap["Up"])
    println(secretMap.values)
    if (4 in secretMap.values) {
        println("Yes is in!")
    }
    val myMutableSecretMap = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
    myMutableSecretMap.put("Four", 4)
    myMutableSecretMap.replace("Four", 4, 5)
    println(myMutableSecretMap)

    val myNewList = mutableListOf<String>()
    myNewList.add(4.toString())
    myNewList.add("Lynne")
    println(myNewList)
    for (i in 1..10){
        myNewList.add(i.toString())
    }
    println(myNewList)

    val myNewSet = mutableSetOf<String>("Lynne", "Maria", "John")
    myNewSet.add("Alicia")
    myNewSet.add("Maria")
    println(myNewSet)

    // Empty collections
    val empty = emptyList<String>()
    val emptySet = emptySet<Int>()
    val emptyMap = emptyMap<String, Int>()

    // Collection Filters
    val myNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    myNumbers.filter { it % 2 == 0}.forEach { println(it) }
    val results = myNumbers.filter {
        it > 4
    }
    println(results)

    val names = listOf("Alicia, Lynne, Maria, John, Bob")
    val myNames = names.filter{
        it.startsWith("A", ignoreCase = true)
    }
    println(myNames)
    val car = Car("Yellow", "CX60")
    val secondCar = Car(color = "Purple", model = "Civic")
    secondCar.color = "Red"
    secondCar.speed(40, 100)
    println("Second Car: ${secondCar.color}, ${secondCar.model}")
    car.color = "Blue"
    car.model = "BMW"
    println(car.color)
    println(car.model)
    println(car.drive())

    // Truck
    val truck = Truck("Magenta", "F16")
    truck.drive()
    truck.tow()
}

open class Car(var color: String, var model: String) {
    init {
        if (color == "Red") {
            println("This is a red car")
        }
        else {
            println("This is not a red car")
        }
    }
    //Methods
    open fun drive() {
        println("Driving")
    }
    open fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Speeding")
    }
}

class Truck(color: String, model: String): Car(color, model) {
    fun tow() {
        println("Towing")
    }
    override fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Truck is Speeding")
    }
    override fun drive() {
        // super.drive()
        println("Truck is Driving")
    }
} */

/* fun main() {
    val button = Button(label = "Submit")
    button.onClick("Your work has been submitted")

    val character = Character(name = "Lynne")
    character.onClick("You have clicked on Lynne")
}
class Button(val label: String): ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $label and here's the message $message")
    }
}

class Character(val name: String): ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $name and here's the message $message")
    }
}
//Interface
interface ClickEvent {
    fun onClick(message: String)
} */

/* fun main() {
    val myString = "cat"
    println(myString.append("Walk"))
    println(myString.removeFirstLastChar())
}

// Extension Functions
fun String.append(value: String): String {
    return this.plus(value)
}

fun String.removeFirstLastChar(): String {
    return this.drop(1).dropLast(1)
} */

/* fun main() {
    val user = User("Lynne", 21, "munini@gmail.com")
    println(user)
    val listOfUsers = listOf(user, User("Maria", 22, "maria@gmail.com"), User("John", 23, "John@gmail.com"))
    println(listOfUsers)
    listOfUsers.forEach {
        println(it.age)
    }
}
// Data Classes
data class User(val name: String, val age: Int, val email: String) */

/* fun main() {
    val listOfItems = listOf("Lynne", "Maria", "John", "Alicia")
    val listOfNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val finder = Finder(listOfNumbers)
    finder.findItem(item = 8) {
        println("Found $it")
    }
}

class Finder<T> (private val list: List<T>) {
    fun findItem(item: T, foundItem: (item: T?) -> Unit) {
        val itemFoundList = list.filter {
            it == item
        }
        if (itemFoundList.isNullOrEmpty()) foundItem(null)
        else foundItem(itemFoundList[0])
    }
}*/

fun main() {
    Repository.startFetch()
    getResult(result = Repository.getCurrentState())
    Repository.finishedFetch()
    getResult(result = Repository.getCurrentState())
    Repository.errorFetch()
    getResult(result = Repository.getCurrentState())
    Repository.customFailure()
    getResult(result = Repository.getCurrentState())
    Repository.anotherFailure()
    getResult(result = Repository.getCurrentState())
}
fun getResult(result: Result) {
    return when(result){
        is Error -> {
            println(result.exception.toString())
        }
        is Success -> {
            println(result.dataFetched?: "Ensure you start the fetch function first")
        }
        is Loading -> {
            println("Loading...")
        }
        is NotLoading -> {
            println("Not Loading...")
        }
        is Failure.AnotherFailure -> {
            println(result.anotherFailure.toString())
        }
        is Failure.CustomFailure -> {
            println(result.customFailure.toString())
        }

    }
}

object Repository {
    private var loadState: Result = NotLoading
    private var dataFetched: String? = null
    fun startFetch() {
        loadState = Loading
        dataFetched = "data"
    }
    fun finishedFetch() {
        loadState = Success(dataFetched)
        dataFetched = null
    }
    fun errorFetch() {
        loadState = Error(exception = Exception("Error"))
        dataFetched = null
    }
    fun getCurrentState(): Result {
        return loadState
    }
    fun customFailure() {
        loadState = Failure.CustomFailure(customFailure = IOException("Custom Failure"))
    }
    fun anotherFailure() {
        loadState = Failure.AnotherFailure(anotherFailure = NullPointerException("Something went wrong!"))
    }
    fun getItems(): List<String> {
        return listOf("Lynne", "Maria", "John", "Alicia")
    }
}

/* enum class Result {
    SUCCESS,
    FAILURE,
    ERROR,
    IDLE,
    LOADING
} */
sealed class Result

data class Success(val dataFetched:String?): Result()
data class Error(val exception: Exception): Result()
object NotLoading: Result()
object Loading: Result()

sealed class Failure: Result() {
    data class CustomFailure(val customFailure: IOException): Failure()
    data class AnotherFailure(val anotherFailure: NullPointerException): Failure()
}
