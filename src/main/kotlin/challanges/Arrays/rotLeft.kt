package challanges.Arrays

/**
 * Sample input -
 * 5 4
 * 1 2 3 4 5
 *
 * Sample output -
 * 5 1 2 3 4
 */

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {

    if(d%a.size!=0){
        val actualTimes = d%a.size
//        println(d-actualTimes)
        if((a.size - actualTimes)>=(a.size/2 + 1))
        {
            /**
             * Rotate left
             */
            repeat(actualTimes){
                val start = a[0]
                for(i in 0..a.size-2){
                    a[i] = a[i+1]
                }
                a[a.size-1] = start
            }
        }else
        {
            /**
             * Its more useful to rotate right
             */
            repeat(a.size-actualTimes){
                val start = a[a.size-1]
                for(i in a.size-1 downTo 1){
                    a[i] = a[i-1]
                }
                a[0] = start
            }
        }
    }
    return a
}
