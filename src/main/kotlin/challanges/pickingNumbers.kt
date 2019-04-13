package challanges

fun pickingNumbers(a: Array<Int>): Int {
    var res = 2

    for(j in 0..100){
        var c = 0
        for(i in 0..a.size-1)
        {
            println("${a[i]} = ${j} asd c is ${c}")
            if((a[i]==j) || (a[i]==j+1))
            c++
        }
        res = Math.max(res,c)
    }

    /*two approaches both are correct
    *In one all numbers are equated in other all the possible chains are made
     */

  /*  var lenArr = Array(a.size,{0})
    a.sort()

    for(c in 0..a.size-1){
        var resArr = arrayListOf<Int>()
        resArr.add(a[c])
        for(n in 0..a.size-1){
            if(c!=n){
                var keep = true
                for(i in 0..resArr.size-1){
                    if((Math.abs(resArr[i]-a[n]))>1){
                        keep = false
                    }
                }
                if(keep){
                    resArr.add(a[n])
                }
            }

        }

        lenArr[c] = resArr.size
//        println(resArr)
    }



    res = lenArr.max() as Int*/
    return res
}