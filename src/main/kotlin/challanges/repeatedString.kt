package challanges

/*val s = "aba"
    val n = 10L
    result = repeatedString(s,n).toString()*/

fun repeatedString(s: String, n: Long): Long {
    var count = 0L
    val strLen = s.length
    if(strLen==1){
        if(s == "a")
        {
            count = n
        }
    }
    else {
        var countInString = 0L
        val charArr = s.toCharArray()
        for (j in 0..charArr.size - 1) {
            if (charArr[j] == 'a') {
                countInString++
            }
        }
        val loopTimes = n / strLen
        val remainderLength = n % strLen
        if (remainderLength == 0L) {

            count = countInString * loopTimes
        } else {
            count = countInString * loopTimes

            val charArr = s.substring(0, remainderLength.toInt()).toCharArray()
            for (j in 0..charArr.size - 1) {
                if (charArr[j] == 'a') {
                    count++
                }
            }
        }
    }

    return count
}

/*val arr = arrayOf(1,3,5,7,9)
result = miniMaxSum(arr).toString()*/

fun miniMaxSum(arr: Array<Int>): Unit {
        val totSum = arr.sum()
        val sumArr = Array<Int>(arr.size,{i ->  totSum-arr[i]})
        print(sumArr.min())
        print(" ")
        print(sumArr.max())
}