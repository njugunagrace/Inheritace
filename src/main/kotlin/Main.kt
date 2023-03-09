fun main(){
val car = Car("Toyota", "Corolla","white",5)
    car.carry(4)
    car.carry(7)
    car.identity()
    car.calculateParkingFees(2)

val bus =  Bus("Nissan","single-deck","blue",32)
    bus.maxTripsFare(100.0)
    bus.carry(30)
    bus.carry(35)
    bus.identity()
    bus.calculateParkingFees(3)
}

open class Car (var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        var x = people - capacity
        if (people == capacity){
            println("Carrying ${people} passengers")
        }
        else if (people > capacity) {
            println("Over capacity by $x people")
        }
    }

    fun identity(){
        var stmt = "I am a $color $make $model"
        println(stmt)


    }
    open fun calculateParkingFees(hours:Int):Int{
        var parkingFees = (20 * hours)
        return (parkingFees )
    }
}
class Bus( make:String,  model:String,  color:String,  capacity:Int): Car(make, model ,color, capacity){
    fun maxTripsFare(fare:Double):Double {
        return capacity * fare

    }

    override fun calculateParkingFees(hours: Int): Int {
        var calculate = 20 * hours * capacity
        return calculate
    }



}