package challanges

/*val hikeString = "UDDDUDUU"
    result = countingValleys(hikeString.length,hikeString).toString()*/

fun countingValleys(n: Int, s: String):Int{
    var count = 0
    val chars = s.toCharArray()
    var lastAltitude = 0
    var altitude = 0

    for(i in 0..chars.size-1){
        if(chars[i]=='D'){
            altitude--

        }else if(chars[i]=='U')
        {
            altitude++
        }
        if((lastAltitude==0)&&(altitude<0)){
            count++
        }
        lastAltitude = altitude
    }
    return count
}