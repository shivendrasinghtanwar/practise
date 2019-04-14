package challanges.isValidSherlockString

import kotlin.math.min

fun isValidSherlockString(req: String):String{
    var response = "NO"
    val charArr = req.toCharArray()
    val countArr = Array<Int>(26,{0})

    for (letter in charArr){
            when(letter){
                'a'->{countArr[0]++}
                'b'->{countArr[1]++}
                'c'->{countArr[2]++}
                'd'->{countArr[3]++}
                'e'->{countArr[4]++}
                'f'->{countArr[5]++}
                'g'->{countArr[6]++}
                'h'->{countArr[7]++}
                'i'->{countArr[8]++}
                'j'->{countArr[9]++}
                'k'->{countArr[10]++}
                'l'->{countArr[11]++}
                'm'->{countArr[12]++}
                'n'->{countArr[13]++}
                'o'->{countArr[14]++}
                'p'->{countArr[15]++}
                'q'->{countArr[16]++}
                'r'->{countArr[17]++}
                's'->{countArr[18]++}
                't'->{countArr[19]++}
                'u'->{countArr[20]++}
                'v'->{countArr[21]++}
                'w'->{countArr[22]++}
                'x'->{countArr[23]++}
                'y'->{countArr[24]++}
                'z'->{countArr[25]++}
            }

        }
        val minCount = countArr.min() as Int
        for(itm in countArr){
            if(itm!=0){
//                minCount =
            }
        }


        println("mimi${minCount}")
        val minCountArr = Array(26) { i ->
            if (countArr[i] != 0) {
                countArr[i] - minCount
            }
            else {
                0
            }
        }

        println(minCountArr.size)
        var c = 0
        for(item in minCountArr){
//            print(c)
            c++
            print(item.toString() + " ")
        }

    return response
}