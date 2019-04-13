package challanges.climbingTheLeaderboard

import java.util.Arrays.binarySearch
import java.util.stream.IntStream.range


fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int>
{
    val rankArr = Array<Int>(alice.size,{0})
    val testArr = scores.distinct().toIntArray()
    var rankCounter = testArr.size-1
    for(i in 0..alice.size-1){
        while (rankCounter>=0){
//            println("this")
            if(alice[i]>=testArr[rankCounter]){
                rankCounter--
            }else
            {
                rankArr[i] = rankCounter+2
                break
            }
        }
        if(rankCounter<0)
        {
            rankArr[i] = 1
        }
    }
    return rankArr
}
