//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val banker = Banker("Kevin",23,71)
    val doctor = Doctor("Ann", 19,60)
    val farmer = Farmer("Scarlet",22,)


    banker.name
    banker.age
    banker.introduction()
    doctor.introduction()
    farmer.introduction()

    banker.eat()
    banker.countMoney(arrayOf(100,50,200,500,100))
    banker.sleep()
    banker.talk("Right turn")

    farmer.eat()
    farmer.sleep()
    farmer.cultivateLand()

    doctor.eat()
    doctor.sleep()
    doctor.treatPatient("Vivian","Malaria")
}
open class  Person(var name: String, var age: Int, weight: Int){
    fun talk(words: String) {
       println(words)
   }
    open fun eat() {
        println("Yum")
    }
    fun sleep() { println("zzzzzz")
    }
    open fun introduction(){
        println("Hi, I am $name")
    }
}

class Banker(name: String, age: Int, weight: Int) : Person(name, age, weight,){

    fun countMoney(notes: Array<Int>): Int {
        var sum = 0
        notes.forEach { note -> sum += note }
        return sum
    }
}

class Doctor(name: String, age: Int, weight: Int) :Person(name, age, weight){

    fun treatPatient(patient:String,disease:String){
        println("Treat $patient for $disease ")
    }
    override fun introduction() { super.introduction()
       println("Hi, I am  Doctor $name")
    }
}

class Farmer(name: String,age: Int): Person(name, age, weight = 4){

   fun cultivateLand(){
       println("dig dig dig")
   }
   override fun eat(){
       super.eat()
        println("I am eating the food that I have grown")
    }

  override fun introduction(){
      println("I am Doctor $name")}


    class  Human( name:String,var age:Int, var weight:Int){

   fun eat(foodWeight:Int){
   println("I am eating $foodWeight kgs of food ")
       weight+=foodWeight
       println(weight)
   }
    fun speak(speech:String){
        println(speech)

    }
    fun birthday(){
        age++
        println(age)
    } }

class Car(  var model:String, var make:String, var color:String, var capacity:Int=3){
    fun carry(people:Int){
        if (people == capacity){
            println("carrying $people passengers")
        }
        else{
            var overcapacity = people - capacity

            println("Over capacity by $overcapacity people")
        }
    }

    fun identity(){
        println("I am a $color $model legacy")

    }
    fun parkingFees(hours:Int):Int{
        var total = hours *20
        println(total)
        return total

    }
}
class Bus(make:String,model:String,color:String,capacity: Int=3){
    fun carry(people:Int){
        var capacity = 5
        if (people == capacity){
            println("carrying $people passengers")
        }
        else{
            var overcapacity = people - capacity

            println("Over capacity by $overcapacity people")
        } }

fun identity() {
    println("This $")
    fun parkingFees(hours: Int): Int {
        var total = hours * 20
        println(total)
        return total

    }
}}}






