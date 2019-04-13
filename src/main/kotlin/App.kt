import challanges.climbingTheLeaderboard.climbingLeaderboard
import challanges.miniMaxSum
import challanges.pickingNumbers.pickingNumbers

fun main(){
    var result = ""


    val scores = arrayOf(100,100,50,40,40,20,10)
    val alice = arrayOf(5,25,50,50,120)
    result = climbingLeaderboard(scores,alice).joinToString("\n")


    println()
    println()
    println(result)
}