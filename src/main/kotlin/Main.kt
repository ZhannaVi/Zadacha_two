fun main(args: Array<String>) {
val oneStr = "AASADDSS"
    var count = 1
    var currentChar = oneStr[0]
    var itogStr=""
    for(item in 1 .. oneStr.substring(1).length)
    {
        if(currentChar==oneStr[item])
        {
            count++
            currentChar=oneStr[item]
        }
        else
        {
            if(count>1)
            {
                itogStr+="$currentChar$count"
            }
            else
            {
                itogStr+=currentChar
            }
            count = 1
            currentChar=oneStr[item]
        }
    }
    if(count>1)
    {
        itogStr+="$currentChar$count"
    }
    else
    {
        itogStr+=currentChar
    }
    println(itogStr)
}