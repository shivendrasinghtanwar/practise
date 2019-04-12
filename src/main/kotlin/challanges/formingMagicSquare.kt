package challanges

fun formingMagicSquare(s: Array<Array<Int>>): Int {
    var cost = 0
    for(item in s){
       val itemSum = item.sum()
        if(itemSum!=15)
       {
           if(itemSum<15){
               cost = cost + (15 - itemSum)
           }else
           {
               cost = cost + (itemSum - 15)
           }
       }
    }

    return cost
}