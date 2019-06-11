package challanges.FizzBuzz

fun fizzBuzz(totalNum:Int){

    for(i in 1..totalNum){
        var output = i.toString()
        if(checkDivisibleBy3(i)){
            output = "Fizz"
            if(checkDivisibleBy5(i)){
                output += "Buzz"
            }
        }
        else if(checkDivisibleBy5(i)){
            output = "Buzz"
        }

        println(output)
    }
}

private fun checkDivisibleBy3(number:Int):Boolean{
    var isDivisible = false
    if(number%3==0){
        isDivisible = true
    }
    return isDivisible
}
private fun checkDivisibleBy5(number:Int):Boolean{
    var isDivisible = false
    if(number%5==0){
        isDivisible = true
    }
    return isDivisible
}