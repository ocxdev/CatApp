class Cat (val name: String, var age: Int, var weight: Int) {

//    val namee: String
//    var agee: Int
//    var weightt: Int
//
//    init {
//        namee = name
//        agee = age
//        weightt = weight
//    }

    fun walk() {
        weight--
    }

    fun eat() {
        weight++
    }



    override fun toString() : String {
        return "Name: $name Age: $age, weight: $weight"
    }
}
