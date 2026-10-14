class Cat (val name: String, var age: Int, var weightIn: Int) {

//    val namee: String
//    var agee: Int
//    var weightt: Int
//
//    init {
//        namee = name
//        agee = age
//        weightt = weight
//    }

    var weight = weightIn
        private set

    public fun walk(distance: Int) : Boolean
    {
        if(weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }

    fun eat(amount: Int) : Boolean {
        if (weight + amount <= 20){
            weight += amount
            return true
        }
        return false
    }



    override fun toString() : String {
        return "Name: $name Age: $age, weight: $weight"
    }
}
