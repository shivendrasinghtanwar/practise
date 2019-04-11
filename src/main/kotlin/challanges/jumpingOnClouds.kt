package challanges

fun jumpingOnClouds(c: Array<Int>): Int {
    var threshold = 0
    var count = 0
    for(i in 1..c.size-1){
        if(c[i]==0){
            threshold++
        }
        if(c[i]==1){
            threshold = 1
        }
        if(threshold==1){
            count++
        }
        if(threshold>1){
            threshold = 0
        }
    }
    return  count
}