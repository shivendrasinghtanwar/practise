import challanges.countingValleys
import challanges.sockMerchant

fun main(){
    var result = ""
//    val ar = arrayOf(1,1,3,1,2,1,3,3,3,3)
//    sockMerchant(ar.size,ar).toString()

    val hikeString = "UDDDUDUU"
    result = countingValleys(hikeString.length,hikeString).toString()

    println(result)
}