package challanges


/*val ar1 = arrayOf(4,8,2)
    val ar2 = arrayOf(4,5,7)
    val ar3 = arrayOf(6,1,6)
    val twoDArr = arrayOf(ar1,ar2,ar3)
    result = formingMagicSquare(twoDArr).toString()*/

fun formingMagicSquare(s: Array<Array<Int>>): Int {
    var cost = 0

    //#1
    val m1l1 = arrayOf(8,1,6); val m1l2 = arrayOf(3,5,7); val m1l3 = arrayOf(4,9,2)
    val m1 = arrayOf(m1l1,m1l2,m1l3)
    //#2
    val m2l1 = arrayOf(6,1,8); val m2l2 = arrayOf(7,5,3); val m2l3 = arrayOf(2,9,4)
    val m2 = arrayOf(m2l1,m2l2,m2l3)
    //#3
    val m3l3 = arrayOf(8,1,6); val m3l2 = arrayOf(3,5,7); val m3l1 = arrayOf(4,9,2)
    val m3 = arrayOf(m3l1,m3l2,m3l3)
    //#4
    val m4l3 = arrayOf(6,1,8); val m4l2 = arrayOf(7,5,3); val m4l1 = arrayOf(2,9,4)
    val m4 = arrayOf(m4l1,m4l2,m4l3)
    //#5
    val m5l1 = arrayOf(8,3,4); val m5l2 = arrayOf(1,5,9); val m5l3 = arrayOf(6,7,2)
    val m5 = arrayOf(m5l1,m5l2,m5l3)
    //#6
    val m6l1 = arrayOf(4,3,8); val m6l2 = arrayOf(9,5,1); val m6l3 = arrayOf(2,7,6)
    val m6 = arrayOf(m6l1,m6l2,m6l3)
    //#7
    val m7l3 = arrayOf(8,3,4); val m7l2 = arrayOf(1,5,9); val m7l1 = arrayOf(6,7,2)
    val m7 = arrayOf(m7l1,m7l2,m7l3)
    //#8
    val m8l3 = arrayOf(4,3,8); val m8l2 = arrayOf(9,5,1); val m8l1 = arrayOf(2,7,6)
    val m8 = arrayOf(m8l1,m8l2,m8l3)

    val matrixCollection = arrayOf(m1,m2,m3,m4,m5,m6,m7,m8)
    var matCount = 0
    val costArr = Array(8,{0})
    for(matrix in matrixCollection){
        for(i in 0..2){
            for(j in 0..2){
//                print(matrix[i][j])
                costArr[matCount] = costArr[matCount] + Math.abs(s[i][j]-matrix[i][j])
            }
//            println()
        }
//        println()
//        println()
        matCount++
    }

//    println()

    cost = costArr.min() as Int


    return cost
}