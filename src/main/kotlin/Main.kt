fun main(){
    printName("Hilda")
    var result= getRemainder(10,3)
    println(result)
    var sum= sum(6,8,5,4)
    println(sum)
var fact=printIntrestingfact("am super")




}




fun printName(name: String){
    println("Hello" + " " + name)
}




fun getRemainder(num1:Int,num2:Int):Int{
    var modulus =num1 % num2
    return modulus


}


fun sum(a:Int,b:Int,c:Int,d:Int):Int{
    var sum= a+b+c+d
    return sum
}
fun printIntrestingfact(fact: String){
    var fact ="am super"
    println(fact)

}