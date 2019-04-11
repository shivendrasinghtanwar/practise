import challanges.countingValleys
import challanges.jumpingOnClouds
import challanges.sockMerchant

fun main(){
    var result = ""
//    val ar = arrayOf(1,1,3,1,2,1,3,3,3,3)
//    sockMerchant(ar.size,ar).toString()

    /*val hikeString = "UDDDUDUU"
    result = countingValleys(hikeString.length,hikeString).toString()*/

    val ar = arrayOf(0,0,1,0,0,1,0,0)
    result = jumpingOnClouds(ar).toString()

    println(result)
}