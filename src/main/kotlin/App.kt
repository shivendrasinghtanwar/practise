import challanges.climbingTheLeaderboard.climbingLeaderboard
import challanges.isValidSherlockString.isValidSherlockString
import challanges.miniMaxSum
import challanges.pickingNumbers.pickingNumbers

fun main(){
    var result = ""


    /*val scores = arrayOf(100,100,50,40,40,20,10)
    val alice = arrayOf(5,25,50,50,120)
    result = climbingLeaderboard(scores,alice).joinToString("\n")*/

    val s = "aabbcd"
//    result = isValidSherlockString(s)

    val a = arrayOf(7,1,7,4,1,7)
    var minDis = -1
    var numArr = a.distinct().toIntArray()
    for(i in 0..numArr.size-1){
        val comp = numArr[i]
        val firsttime = true
        for(j in 0..a.size-1){
            if(comp == a[j] && firsttime){
                numArr[i] = j+1
            }else if(comp == a[j] && !firsttime){
                numArr[i] = numArr[i] - j
            }
        }
    }
    result =  numArr.min().toString()
    println()
    println()
    println(result)
}