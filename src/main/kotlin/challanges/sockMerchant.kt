package challanges

//    val ar = arrayOf(1,1,3,1,2,1,3,3,3,3)
//    sockMerchant(ar.size,ar).toString()

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var copyArr = ar
    var counter = 0

//    println("hey")
    var mymap = mapOf<Int,Int>()
    mymap = mymap.plus(Pair(ar[0],1))
    for(i in 1..n-1){


//        println(mymap.contains(ar[i]))
        if(mymap.contains(ar[i])){
            var value = mymap.get(ar[i])
            value as Int
            println(value)
            value++
//            println("hey2")
            mymap = mymap.plus(Pair(ar[i],value))
        }
        else{
            mymap = mymap.plus(Pair(ar[i],1))
        }
    }
    println(mymap)
    for(k in mymap.keys){
        counter = counter + (mymap.get(k) as Int)/2
//        println("${k}----${mymap.get(k)}")
    }

    return counter
}