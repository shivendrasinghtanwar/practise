package challanges.Arrays

/**
 * Hour Glass Sum
 * Sample input -
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 *
 * Sample output -
 * 19
 *
 * Odd input --
 * -1 -1 0 -9 -2 -2
 * -2 -1 -6 -8 -2 -5
 * -1 -1 -1 -2 -3 -4
 * -1 -9 -2 -4 -4 -5
 * -7 -3 -3 -2 -9 -9
 * -1 -3 -1 -2 -4 -5
 *
 * odd output -
 * -6
 *
 *  val r1 = arrayOf(-1,-1,0,-9,-2,-2)
 *  val r2 = arrayOf(-2,-1,-6,-8,-2,-5)
 *  val r3 = arrayOf(-1,-1,-1,-2,-3,-4)
 *  val r4 = arrayOf(-1,-9,-2,-4,-4,-5)
 *  val r5 = arrayOf(-7,-3,-3,-2,-9,-9)
 *  val r6 = arrayOf(-1,-3,-1,-2,-4,-5)
 *  val arr = arrayOf(r1,r2,r3,r4,r5,r6)
 *
 *
 */

fun hourglassSum(arr: Array<Array<Int>>): Int {

    var max = -100
    for(i in 0..arr.size-1){
        for(j in 0..arr[i].size-1){
            if((j+2<6) && (i+2<6)){
                val sum = calculateSumOfOneHourGlass(j,i,arr)
//                print(sum)
                if(sum>max){
                    max = sum
                }
//                print(" ")
            }
        }
//        println()
    }
    return max
}

fun calculateSumOfOneHourGlass(x:Int,y:Int,arr: Array<Array<Int>>):Int{
    var sum = 0
        sum += arr[y][x] + arr[y][x+1] + arr[y][x+2]
        sum += arr[y+1][x+1]
        sum += arr[y+2][x] + arr[y+2][x+1] + arr[y+2][x+2]
    return sum
}